package com.example.employeeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmployeeServiceApplication {

	public static void main(String[] args) {
		System.out.println("This is a another 1 test commit");
		System.out.println("This is a another 2 test commit");
		System.out.println("This is a another 3 test commit");
		System.out.println("This is a another 4 test commit");
		System.out.println("Another comment");
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
