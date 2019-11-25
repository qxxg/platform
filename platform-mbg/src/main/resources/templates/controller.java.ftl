package ${package.Controller};


import org.springframework.web.bind.annotation.*;

<#if restControllerStyle>
    import org.springframework.web.bind.annotation.RestController;
<#else>
    import org.springframework.stereotype.Controller;
</#if>
import com.qxxg.springcloud.platformcommon.result.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import io.swagger.annotations.Api;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import java.util.*;
import  ${package.Service}.${table.serviceName};
import  ${package.Entity}.${table.entityName};
<#if superControllerClassPackage??>
    import ${superControllerClassPackage};
</#if>

/**
* <p>
    * ${table.comment!} 前端控制器
    * </p>
*
* @author ${author}
* @since ${date}
*/
<#if restControllerStyle>
    @RestController
<#else>
    @Controller
</#if>
@Slf4j
@Api(value = "${table.name}CRUD接口")
@RequestMapping("<#if package.ModuleName??>/${package.ModuleName}</#if>/<#if controllerMappingHyphenStyle??>${controllerMappingHyphen}<#else>${table.entityPath}</#if>")
<#if kotlin>
    class ${table.controllerName}<#if superControllerClass??> : ${superControllerClass}()</#if>
<#else>
    <#if superControllerClass??>
        public class ${table.controllerName} extends ${superControllerClass} {
    <#else>
        public class ${table.controllerName} {
    </#if>

    @Autowired
    private ${table.serviceName} ${table.name}Service;

    @ApiOperation(value = "获取${table.name}列表",notes="")
    @ApiImplicitParam(name = "map", value = "${table.name}实体中的参数", required = true, dataType = "Map")
    @GetMapping("/")
    public CommonResult ${table.name}List(@RequestParam Map<String,Object> map) throws Exception {
    Collection<${table.entityName}> ${table.name}List = ${table.name}Service.listByMap(map);
    return CommonResult.success(${table.name}List);
    }

    @ApiOperation(value = "修改${table.name}",notes="根据id修改${table.name}")
    @ApiImplicitParam(name = "${table.name}", value = "${table.name}实体", required = true, dataType = "Student")
    @PutMapping("/")
    public CommonResult ${table.name}Update(@RequestBody  ${table.entityName} ${table.name}) throws Exception {
    Boolean flag = ${table.name}Service.updateById(${table.name});
    return CommonResult.success(flag);
    }


    @ApiOperation(value = "删除${table.name}",notes="根据id删除${table.name}")
    @ApiImplicitParam(name = "id", value = "${table.name}id", required = true, dataType = "<#list table.fields as field><#if field.keyFlag == true>${field.columnType?lower_case?cap_first}</#if></#list> ")
    @DeleteMapping("/{id}")
    public CommonResult ${table.name}Delete(@PathVariable <#list table.fields as field><#if field.keyFlag == true>${field.columnType?lower_case?cap_first}</#if></#list> id) throws Exception {
    Boolean flag = ${table.name}Service.removeById(id);
    return CommonResult.success(flag);
    }

    @ApiOperation(value = "添加${table.name}",notes="新增一条${table.name}")
    @ApiImplicitParam(name = "${table.name}", value = "${table.name}实体", required = true, dataType = "${table.name}")
    @PostMapping("")
    public CommonResult ${table.name}Add(@RequestBody  ${table.entityName} ${table.name}) throws Exception {
    Boolean flag = ${table.name}Service.save(${table.name});
    return CommonResult.success(flag);
    }
    }
</#if>