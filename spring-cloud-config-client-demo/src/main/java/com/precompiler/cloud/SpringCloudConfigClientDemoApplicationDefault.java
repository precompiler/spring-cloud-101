package com.precompiler.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringCloudConfigClientDemoApplicationDefault {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringCloudConfigClientDemoApplicationDefault.class, args);
	}
}
