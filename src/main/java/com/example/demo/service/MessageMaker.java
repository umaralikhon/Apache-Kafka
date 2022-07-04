package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MessageMaker {

    public String makeMessage(String message){
        return "I got and handled the message: " + message;
    }
}
