package com.example.serviceb_sender_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ServicebSenderAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicebSenderAppApplication.class, args);
	}

}
