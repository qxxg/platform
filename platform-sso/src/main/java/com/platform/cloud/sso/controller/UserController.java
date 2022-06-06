package com.platform.cloud.sso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @Author SmallSand
 * @Date 2019/11/4  17:04
 */
@RestController
@RequestMapping()
public class UserController {

    @GetMapping("/user/info")
    public Principal user(Principal user) {
        return user;
    }
}
