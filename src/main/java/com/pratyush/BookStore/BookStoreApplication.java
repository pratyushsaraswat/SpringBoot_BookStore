package com.pratyush.BookStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@ComponentScan(basePackages = "com.pratyush.entity") // Specify the base package to scan
@RestController
public class BookStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

}
