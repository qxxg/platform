package com.qxxg.springcloud.platformuser.controller;


import com.qxxg.springcloud.platformcommon.result.CommonResult;
import com.qxxg.springcloud.platformmbg.entity.UmsRole;
import com.qxxg.springcloud.platformmbg.service.UmsRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Map;

/**
 * <p>
 * 后台用户角色表 前端控制器
 * </p>
 *
 * @author smallsand
 * @since 2019-11-19
 */
@RestController
@Slf4j
@Api(value = "ums_roleCRUD接口")
@RequestMapping("/umsRole")
public class UmsRoleController {

    @Autowired
    private UmsRoleService ums_roleService;

    @ApiOperation(value = "获取ums_role列表", notes = "")
    @ApiImplicitParam(name = "map", value = "ums_role实体中的参数", required = true, dataType = "Map")
    @GetMapping("/")
    public CommonResult ums_roleList(@RequestParam Map
            <String, Object> map) throws Exception {

        Collection<UmsRole> ums_roleList = ums_roleService.listByMap(map);
        return CommonResult.success(ums_roleList);
    }

    @ApiOperation(value = "修改ums_role", notes = "根据id修改ums_role")
    @ApiImplicitParam(name = "ums_role", value = "ums_role实体", required = true, dataType = "Student")
    @PutMapping("/")
    public CommonResult ums_roleUpdate(@RequestBody UmsRole ums_role) throws Exception {

        Boolean flag = ums_roleService.updateById(ums_role);
        return CommonResult.success(flag);
    }


    @ApiOperation(value = "删除ums_role", notes = "根据id删除ums_role")
    @ApiImplicitParam(name = "id", value = "ums_roleid", required = true, dataType = "Long ")
    @DeleteMapping("/{id}")
    public CommonResult ums_roleDelete(@PathVariable Long id) throws Exception {
        Boolean flag = ums_roleService.removeById(id);
        return CommonResult.success(flag);
    }

    @ApiOperation(value = "添加ums_role", notes = "新增一条ums_role")
    @ApiImplicitParam(name = "ums_role", value = "ums_role实体", required = true, dataType = "ums_role")
    @PostMapping("")
    public CommonResult ums_roleAdd(@RequestBody UmsRole ums_role) throws Exception {

        Boolean flag = ums_roleService.save(ums_role);
        return CommonResult.success(flag);
    }
}
