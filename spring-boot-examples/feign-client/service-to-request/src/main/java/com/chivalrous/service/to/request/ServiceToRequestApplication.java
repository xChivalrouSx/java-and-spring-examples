package com.chivalrous.service.to.request;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ServiceToRequestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceToRequestApplication.class, args);
	}

}