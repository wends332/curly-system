package com.wen.springboot.demo_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class ApplicationRun {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationRun.class, args);
	}
}
