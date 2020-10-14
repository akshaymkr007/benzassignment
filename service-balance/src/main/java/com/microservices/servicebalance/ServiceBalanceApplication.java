package com.microservices.servicebalance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class ServiceBalanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceBalanceApplication.class, args);
	}

}
