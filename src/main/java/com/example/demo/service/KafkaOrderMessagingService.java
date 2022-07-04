package com.example.demo.service;

import com.example.demo.dto.MessageRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaOrderMessagingService implements OrderMessagingService {

    private final KafkaTemplate<String, MessageRequest> kafkaTemplate;

    public KafkaOrderMessagingService(KafkaTemplate<String, MessageRequest> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void sendOrder(MessageRequest messageRequest){
        kafkaTemplate.send("my.message", messageRequest);
    }



}
