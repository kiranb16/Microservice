package com.codemind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroContactServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroContactServiceApplication.class, args);
	}

}
