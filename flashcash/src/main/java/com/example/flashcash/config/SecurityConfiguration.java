package com.example.flashcash.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfiguration {


    @Bean
    public class PasswordEncoder passwordEncoder() {

        return new BCryptPasswordEncoder();
    }
}
