package com.example.serviceb_receiver_app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;

@SpringBootApplication
@EnableJms
public class ServicebReceiverAppApplication {

	private static final String QUEUE_NAME = "queue-notify";

	public static void main(String[] args) {

		SpringApplication.run(ServicebReceiverAppApplication.class, args);

		//System.out.println("Queue: " + QUEUE_NAME);

	}

	@JmsListener(destination = QUEUE_NAME, containerFactory = "jmsListenerContainerFactory")
	public void receiveMessages(String message){
		//System.out.println("Queue: " + QUEUE_NAME);

		System.out.println("Received: " + message);
	}

}
