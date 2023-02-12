package com.bloomtech.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Tells the server this is a sprint boot app.
public class FirstSpringBootAppApplication {

	public static void main(String[] args) {
		// Start the server with this class.
		SpringApplication.run(FirstSpringBootAppApplication.class, args);}

}
