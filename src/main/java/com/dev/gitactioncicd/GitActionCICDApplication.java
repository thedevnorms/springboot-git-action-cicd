package com.dev.gitactioncicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.dev.controllers"})
public class GitActionCICDApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitActionCICDApplication.class, args);
	}

}
