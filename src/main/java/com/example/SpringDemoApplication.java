package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		{
			SpringApplication.run(SpringDemoApplication.class, args);
		}
	}

	@GetMapping(value = "/")
	public String HelloWorld(){
		return "Hello World";
	}


}


