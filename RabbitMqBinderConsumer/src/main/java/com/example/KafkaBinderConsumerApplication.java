package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;

@SpringBootApplication
@EnableBinding(Processor.class)
public class KafkaBinderConsumerApplication {
	public static void main(String[] args) {
		SpringApplication.run(KafkaBinderConsumerApplication.class, args);
	}
}
