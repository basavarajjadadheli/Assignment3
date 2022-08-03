package com.terra.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurkaDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurkaDiscoveryServiceApplication.class, args);
	}

}
