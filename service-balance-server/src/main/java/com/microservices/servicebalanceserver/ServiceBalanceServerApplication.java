package com.microservices.servicebalanceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ServiceBalanceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceBalanceServerApplication.class, args);
	}

}
