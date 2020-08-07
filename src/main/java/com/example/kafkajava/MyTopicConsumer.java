package com.example.kafkajava;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MyTopicConsumer {

    private final List<String> messages = new ArrayList<>();
    private static final String MY_TOPIC = "myTopic";
    private static final String GROUP_ID = "kafka-sandbox";

    @KafkaListener(topics = MY_TOPIC, groupId = GROUP_ID)
    public void listen(String message) {
        synchronized (messages) {
            messages.add(message);
        }
    }

    public List<String> getMessages() {
        return messages;
    }

}
