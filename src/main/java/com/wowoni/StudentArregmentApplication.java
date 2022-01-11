package com.wowoni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StudentArregmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentArregmentApplication.class, args);
	}
	
	@Bean 
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
