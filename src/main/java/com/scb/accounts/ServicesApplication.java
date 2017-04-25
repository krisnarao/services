package com.scb.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServicesApplication {

	
	@RequestMapping("/home")
	public String home()
	{
		return "Welcome to New world of development";
	}
	public static void main(String[] args) {
		
		SpringApplication.run(ServicesApplication.class, args);
		System.out.println("Spring application is starting with spring boot");
	}
}
