package com.example.demo.service;

import com.example.demo.dto.MessageRequest;

public interface OrderMessagingService {

    void sendOrder(MessageRequest messageRequest);

}
