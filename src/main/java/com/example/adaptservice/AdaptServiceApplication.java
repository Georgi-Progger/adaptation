package com.example.adaptservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AdaptServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdaptServiceApplication.class, args);
	}

}
