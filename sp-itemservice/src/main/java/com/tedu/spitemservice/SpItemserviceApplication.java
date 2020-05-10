package com.tedu.spitemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpItemserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpItemserviceApplication.class, args);
	}

}
