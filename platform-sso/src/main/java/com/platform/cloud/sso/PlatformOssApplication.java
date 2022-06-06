package com.platform.cloud.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;


//开启授权服务
@EnableAuthorizationServer
//开启资源服务
@EnableResourceServer
@SpringBootApplication
public class PlatformOssApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlatformOssApplication.class, args);
	}

}
