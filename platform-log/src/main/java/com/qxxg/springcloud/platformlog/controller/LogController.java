package com.qxxg.springcloud.platformlog.controller;


import com.qxxg.springcloud.platformcommon.result.CommonResult;
import com.qxxg.springcloud.platformmbg.entity.Log;
import com.qxxg.springcloud.platformmbg.service.LogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author smallsand
 * @since 2019-11-20
 */
@RestController
@Slf4j
@Api(value = "logCRUD接口")
@RequestMapping("/log")
public class LogController {

    @Autowired
    private LogService logService;

    @ApiOperation(value = "获取log列表", notes = "")
    @ApiImplicitParam(name = "map", value = "log实体中的参数", required = true, dataType = "Map")
    @GetMapping("/")
    public CommonResult logList(@RequestParam Map<String, Object> map) throws Exception {
        Collection<Log> logList = logService.listByMap(map);
        return CommonResult.success(logList);
    }

    @ApiOperation(value = "修改log", notes = "根据id修改log")
    @ApiImplicitParam(name = "log", value = "log实体", required = true, dataType = "Student")
    @PutMapping("/")
    public CommonResult logUpdate(@RequestBody Log log) throws Exception {
        Boolean flag = logService.updateById(log);
        return CommonResult.success(flag);
    }


    @ApiOperation(value = "删除log", notes = "根据id删除log")
    @ApiImplicitParam(name = "id", value = "logid", required = true, dataType = "Long ")
    @DeleteMapping("/{id}")
    public CommonResult logDelete(@PathVariable Long id) throws Exception {
        Boolean flag = logService.removeById(id);
        return CommonResult.success(flag);
    }

    @ApiOperation(value = "添加log", notes = "新增一条log")
    @ApiImplicitParam(name = "log", value = "log实体", required = true, dataType = "log")
    @RequestMapping(value = "/fegin/savelogs",method = RequestMethod.POST,consumes = "application/json")
    public String logAdd(@RequestBody  Log log) throws Exception {
        Boolean flag = logService.save(log);
        return flag?"true":"false";
    }

   @GetMapping("/info")
    public String info(@RequestBody Log log){
       System.out.println("============>l:"+log.toString());
        return "treu";
    }

    @GetMapping("/getinfo")
    public String getinfo(@RequestParam String name){
        System.out.println("name============>:"+name);
        return name;
    }

    @GetMapping("/infos")
    public String infoById(@RequestParam String id){
        System.out.println("id============>:"+id);
        return id;
    }
}
