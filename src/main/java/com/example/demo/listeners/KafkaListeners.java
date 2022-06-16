package com.example.demo.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "KafkaDemon", groupId = "TestKafka")
    void listener(String data){
        System.out.println("Listener " + data);
    }
}
