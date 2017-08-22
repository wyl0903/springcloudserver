package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;


@EnableEurekaServer
@SpringBootApplication
public class CloudserverApplication {
	public static void main(String[] args) {
		SpringApplication.run(CloudserverApplication.class, args);
	}
}
