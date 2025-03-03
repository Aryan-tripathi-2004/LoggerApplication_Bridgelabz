package com.demo.LoggerApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.LoggerApplication.component.DemoBean;

@SpringBootApplication
public class LoggerApplication {
	public static final Logger logger = LoggerFactory.getLogger(LoggerApplication.class);
	public static void main(String[] args) {
		logger.debug("welcome to spring concept Demo");
		ApplicationContext context = SpringApplication.run(LoggerApplication.class, args);
		logger.debug("Checking Context: " + context.getBean(DemoBean.class));
		logger.debug("\n***Example Using @Autowired annotation on property***");
	}
}