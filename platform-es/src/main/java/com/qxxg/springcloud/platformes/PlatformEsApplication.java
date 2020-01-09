package com.qxxg.springcloud.platformes;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
@ComponentScan("com.qxxg.springcloud")
@MapperScan("com.qxxg.springcloud.platformmbg.mapper")
@EnableResourceServer
@SpringBootApplication
public class PlatformEsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatformEsApplication.class, args);
    }

}
