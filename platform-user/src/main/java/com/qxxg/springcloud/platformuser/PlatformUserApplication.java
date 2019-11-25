package com.qxxg.springcloud.platformuser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

//@EnableGlobalMethodSecurity(prePostEnabled = true)
@ComponentScan("com.qxxg.springcloud")
@MapperScan("com.qxxg.springcloud.platformmbg.mapper")
@SpringBootApplication
@EnableResourceServer
@EnableFeignClients
public class PlatformUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatformUserApplication.class, args);
    }

}
