package com.precompiler.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * File system backend demo.
 * 
 * Use following requests to verify: 
 * GET http://localhost:8888/demo-app1.json
 * GET http://localhost:8888/demo-app1.yml
 * 
 * @author Richard Li
 *
 */
@SpringBootApplication
@EnableConfigServer
public class FSBackedDemoApplication {

	public static void main(String[] args) {
		// need to use native profile to enable file system backed config server
		System.setProperty("spring.profiles.active", "native");
		SpringApplication.run(FSBackedDemoApplication.class, args);
	}
}
