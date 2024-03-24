package com.example.flashcash.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {


    @Bean
    public class PasswordEncoder passwordEncoder() {

        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .authorizeHttpRequests(requests) -> requests

                    .requestMatchers("/bootstrap.min.css","/index.css","/images/**","/signin",")
                            .anyRequest().authenticated()
                    )


                .formLogin((form) -> form
                        .loginPage("/signin")
                        .permitAll().usernameParameter("email").defaultSuccessUrl(defaultSuccessUrl "/", alwaysUse: true)

        )
        .logout((logout) -> logout.permitAll());

        n http.build();

    }
}
