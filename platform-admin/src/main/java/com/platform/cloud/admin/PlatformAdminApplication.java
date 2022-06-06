package com.platform.cloud.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;


@ComponentScan("com.platform.cloud")
//@MapperScan({"com.platform.cloud.*.mapper", "com.platform.cloud.*.dao"})
@EnableResourceServer
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class PlatformAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlatformAdminApplication.class, args);
	}

}
