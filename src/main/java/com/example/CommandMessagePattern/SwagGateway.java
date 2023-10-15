package com.example.CommandMessagePattern;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;

@MessagingGateway(name = "swagGateway", defaultRequestChannel = "messageChannel")
public interface SwagGateway<T> {
    @Gateway
    void sendMessage(Message<T> swag);
}
