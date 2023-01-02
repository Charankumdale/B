package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Test;

@SpringBootApplication
public class BApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BApplication.class, args);
		
		Test bean = context.getBean(Test.class);
		
		bean.msg();
		
		
	}

}
