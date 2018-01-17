package com.precompiler.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Git backend demo.
 * 
 * Use following requests to verify: 
 * GET http://localhost:8888/dummy-application.json
 * GET http://localhost:8888/sample-application.yml
 * 
 * @author Richard Li
 *
 */
@SpringBootApplication
@EnableConfigServer
public class GitBackedDemoApplication {

	public static void main(String[] args) {
		// need to use native profile to enable file system backed config server
		System.setProperty("spring.profiles.active", "git-backed");
		SpringApplication.run(GitBackedDemoApplication.class, args);
	}
}
