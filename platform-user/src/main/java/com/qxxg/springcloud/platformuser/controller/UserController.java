package com.qxxg.springcloud.platformuser.controller;

import com.qxxg.springcloud.platformuser.entity.User;
import com.qxxg.springcloud.platformuser.entity.UserPojo;
import com.qxxg.springcloud.platformuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @Author: smallsand
 * @Date: 2019/11/6 14:34
 */
//@RestController
//@RequestMapping("/api")
public class UserController {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    //@Autowired
    private UserService userServiceImpl;

    @PostMapping("/adduser")
    public String addUser(User up){
        up.setPwd(passwordEncoder.encode(up.getPwd()));
        userServiceImpl.save(up);
        return "OK";
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
