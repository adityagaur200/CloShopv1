package com.backend.paymentservice.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig{
    @Bean
    public WebClient webClient(){
        return webClient();
    }
}
