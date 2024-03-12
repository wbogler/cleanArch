package com.clean.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CleanApplication {

	public static void main(String[] args) {
		SpringApplication.run(CleanApplication.class, args);
	}

}
