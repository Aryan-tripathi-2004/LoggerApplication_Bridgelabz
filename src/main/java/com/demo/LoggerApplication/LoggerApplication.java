package com.demo.LoggerApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.demo.LoggerApplication.component.DemoBean;

@SpringBootApplication
public class LoggerApplication {
	public static void main(String[] args) {
		System.out.println("Welcome to Spring Boot");
		ApplicationContext context = SpringApplication.run(LoggerApplication.class, args);
		System.out.println("Context: " + context.getBean(DemoBean.class));
	}
}