package com.precompiler.cloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DummyConfig {
	@Bean
	public Object dummy(@Value("${name}") String name) {
		System.out.println(">>" + name);
		
		return new Object();
	}
}
