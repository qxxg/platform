package com.qxxg.springcloud.platformoauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

//开启授权服务
@EnableAuthorizationServer
//开启资源服务
@EnableResourceServer
//@EnableEurekaClient
@MapperScan("com.qxxg.springcloud.platformoauth2.mapper")
@SpringBootApplication
public class PlatformOauth2Application {

    public static void main(String[] args) {
        SpringApplication.run(PlatformOauth2Application.class, args);
    }

}
