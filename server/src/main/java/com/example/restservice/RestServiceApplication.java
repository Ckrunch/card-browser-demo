package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.restservice.springlisteners.*;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(RestServiceApplication.class);
        app.addListeners(new AppStartedListener());
        app.run(args);
	}
}
