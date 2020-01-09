package com.qxxg.springcloud.platformseataa.controller;

import com.qxxg.springcloud.platformseataa.entity.UmsMember;
import com.qxxg.springcloud.platformseataa.service.UmsMemberService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

/**
 * @Author: smallsand
 * @Date: 2019/11/6 14:34
 */
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UmsMemberService umsMemberServiceImpl;

    @PostMapping("/adduser")
    public String addUser(@RequestBody UmsMember up){
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
