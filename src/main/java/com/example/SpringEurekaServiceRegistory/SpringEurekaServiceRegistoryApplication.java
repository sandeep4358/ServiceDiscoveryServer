package com.example.SpringEurekaServiceRegistory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringEurekaServiceRegistoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaServiceRegistoryApplication.class, args);
	}

}
