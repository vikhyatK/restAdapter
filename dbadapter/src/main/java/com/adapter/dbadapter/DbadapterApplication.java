package com.adapter.dbadapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class DbadapterApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbadapterApplication.class, args);
	}

}
