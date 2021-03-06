package com.example.demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic initialTopic(){
        return TopicBuilder
                .name("KafkaDemon")
                .build();
    }

    @Bean
    public NewTopic myMessageTopic(){
        return TopicBuilder
                .name("my.message")
                .build();
    }
}
