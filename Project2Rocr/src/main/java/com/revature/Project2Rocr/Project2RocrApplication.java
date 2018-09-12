package com.revature.Project2Rocr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.revature")
@SpringBootApplication
public class Project2RocrApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project2RocrApplication.class, args);
	}
}
