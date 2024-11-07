package com.Project.UnRealProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.Project.UnRealProperties")
public class UnRealPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnRealPropertiesApplication.class, args);
	}

}
