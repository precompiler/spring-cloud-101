package com.precompiler.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringCloudConfigClientDemoApplicationProd {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "production");
		ApplicationContext ctx = SpringApplication.run(SpringCloudConfigClientDemoApplicationProd.class, args);
	}
}
