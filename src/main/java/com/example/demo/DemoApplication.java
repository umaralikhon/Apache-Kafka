package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

import java.sql.SQLOutput;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(DemoApplication.class, args);

	}

	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
		return args -> {
			for(int i = 0; i < 1_000; i++) {
				kafkaTemplate.send("KafkaDemon", "Hello kafka! " + i);
			}
		};
	}

}
