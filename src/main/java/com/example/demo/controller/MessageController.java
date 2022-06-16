package com.example.demo.controller;

import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/message")
@AllArgsConstructor
public class MessageController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("/hello-kafka")
    public void sendMessage(@RequestBody String message){
        kafkaTemplate.send("KafkaDemon", message);
    }

}
