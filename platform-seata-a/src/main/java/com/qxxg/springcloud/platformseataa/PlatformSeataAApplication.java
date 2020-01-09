package com.qxxg.springcloud.platformseataa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@MapperScan("com.qxxg.springcloud.platformseataa.mapper")
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class PlatformSeataAApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatformSeataAApplication.class, args);
    }

}
