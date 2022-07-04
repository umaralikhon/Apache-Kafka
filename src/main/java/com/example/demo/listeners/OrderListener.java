package com.example.demo.listeners;

import com.example.demo.dto.MessageRequest;
import com.example.demo.service.MessageMaker;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderListener {

    private final MessageMaker messageMaker;

    public OrderListener(MessageMaker messageMaker){
        this.messageMaker = messageMaker;
    }

    @KafkaListener(topics = "my.message")
    public String handle(MessageRequest messageRequest){

        System.out.println("I got this message in OrderListener");
        return messageMaker.makeMessage(messageRequest.getMessage());
    }
}


