package com.adapter.dbadapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@EnableEurekaClient
public class DbadapterApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbadapterApplication.class, args);
	}

}
