package com.qxxg.springcloud.platformlog.controller;


import com.qxxg.springcloud.platformcommon.result.CommonResult;
import com.qxxg.springcloud.platformlog.service.RoleService;
import com.qxxg.springcloud.platformmbg.entity.Log;
import com.qxxg.springcloud.platformmbg.entity.UmsRole;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


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
    private RoleService roleServiceImpl;

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
    @GetMapping("/addrole")
    public CommonResult addRole(){
        UmsRole ur = new UmsRole();
        ur.setSort(1);
        ur.setName("ROLE_ADMIN");
        ur.setStatus(1);
        ur.setCreateTime(new Date());
        ur.setAdminCount(1);
        int i = roleServiceImpl.insertSelective(ur);
        if(i==0)
            return CommonResult.failed("角色添加失败");
        else
            return CommonResult.success("角色添加成功");
    }
}
