package com.precompiler.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringCloudConfigClientDemoApplicationProd {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "production");
		SpringApplication.run(SpringCloudConfigClientDemoApplicationProd.class, args);
	}
}
