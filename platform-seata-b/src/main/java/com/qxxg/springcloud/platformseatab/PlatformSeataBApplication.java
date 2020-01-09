package com.qxxg.springcloud.platformseatab;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@MapperScan("com.qxxg.springcloud.platformseatab.mapper")
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class PlatformSeataBApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatformSeataBApplication.class, args);
    }

}
