package com.example.CommandMessagePattern;

import org.springframework.messaging.Message;

public interface SwagService<T> {

    void getMessage(Message<T> message);
}
