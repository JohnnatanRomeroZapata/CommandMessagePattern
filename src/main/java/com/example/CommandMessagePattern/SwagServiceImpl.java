package com.example.CommandMessagePattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
@MessageEndpoint
public class SwagServiceImpl implements SwagService<Swag>{

    private static final Logger logger = LogManager.getLogger(SwagServiceImpl.class);

    @ServiceActivator(inputChannel = "messageChannel")
    @Override
    public void getMessage(Message<Swag> message) {
        logger.info("Receiving message payload: {}", message.getPayload());
    }
}
