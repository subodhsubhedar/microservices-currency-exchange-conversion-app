package com.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class MsMyAppCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsMyAppCloudConfigServerApplication.class, args);
	}

}
