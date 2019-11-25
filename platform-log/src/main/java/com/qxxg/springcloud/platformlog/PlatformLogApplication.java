package com.qxxg.springcloud.platformlog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@ComponentScan("com.qxxg.springcloud")
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.qxxg.springcloud.platformmbg.mapper")
public class PlatformLogApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatformLogApplication.class, args);
    }

}
