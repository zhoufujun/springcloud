package com.springcloud.consumer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;



@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Consumer2Application {

	public static void main(String[] args) {
		SpringApplication.run(Consumer2Application.class, args);
	}
}
