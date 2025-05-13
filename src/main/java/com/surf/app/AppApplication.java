package com.surf.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(AppApplication.class, args);
	}

}
