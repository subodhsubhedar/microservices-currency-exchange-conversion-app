package com.myapp.limits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsLimitsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsLimitsServiceApplication.class, args);
	}

}
