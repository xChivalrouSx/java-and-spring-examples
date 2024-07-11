package com.chivalrous.spring.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigClientApplication.class, args);
	}

}
