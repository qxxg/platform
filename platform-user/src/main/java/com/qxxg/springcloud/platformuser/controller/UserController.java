package com.qxxg.springcloud.platformuser.controller;

import com.qxxg.springcloud.platformcommon.result.CommonResult;
import com.qxxg.springcloud.platformmbg.entity.Log;
import com.qxxg.springcloud.platformmbg.entity.UmsMember;
import com.qxxg.springcloud.platformuser.service.FeginService;
import com.qxxg.springcloud.platformuser.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.time.LocalDateTime;

/**
 * @Author: smallsand
 * @Date: 2019/11/6 14:34
 */
@Api(value = "会员管理",tags = "UserController")
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UmsMemberService umsMemberServiceImpl;

    @ApiOperation("添加用户")
    @PostMapping("/adduser")
    public String addUser(@RequestBody UmsMember up){
        up.setPassword(passwordEncoder.encode(up.getPassword()));
        try {
            umsMemberServiceImpl.addUmsMember(up);
            return "OK";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "ERROR";
    }

    @GetMapping("/user/info")
    public Principal user(Principal user) {
        return user;
    }

    @GetMapping("sayHello1")
    public String sayHello1() {
        return "不需要权限..........";
    }

    @GetMapping("sayHello2")
    public String sayHello2() {
        return "需要权限...........";
    }
}
