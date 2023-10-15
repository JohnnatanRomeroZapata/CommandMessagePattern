package com.example.CommandMessagePattern;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.MessageChannel;

@Configuration
@EnableIntegration
public class CommandMessagePatternConfig {

    @Bean
    public MessageChannel messageChannel(){
        return new DirectChannel();
    }
}
