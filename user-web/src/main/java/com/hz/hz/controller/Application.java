package com.hz.hz.controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.hz")
@EnableEurekaClient
public class Application {
	public static void main(String[] args) {
	  SpringApplication.run(Application.class);
	}
}
