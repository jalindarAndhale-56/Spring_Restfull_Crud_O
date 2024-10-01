package com.cyber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.mypack")
public class Application {

	public static void main(String[] args) {
		System.out.println(" Application started.....");
		SpringApplication.run(Application.class, args);
		System.out.println(" Application ended...");
	}

}
