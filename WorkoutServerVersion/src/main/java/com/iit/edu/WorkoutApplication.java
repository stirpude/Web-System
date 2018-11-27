package com.iit.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.EnableMBeanExport;

@SpringBootApplication
public class WorkoutApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(WorkoutApplication.class, args);
	}
}
