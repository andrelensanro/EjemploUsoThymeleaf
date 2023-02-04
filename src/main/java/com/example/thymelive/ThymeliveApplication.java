package com.example.thymelive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class ThymeliveApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeliveApplication.class, args);
	}

}
