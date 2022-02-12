package com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jenkkin21Application {
	public static Logger logger=LoggerFactory.getLogger(Jenkkin21Application.class);
	
	
	
	@PostConstruct
	public void inj() {
		logger.info("Application started.....");
	}

	public static void main(String[] args) {
		SpringApplication.run(Jenkkin21Application.class, args);
		System.out.println("hloo");
	}

}
