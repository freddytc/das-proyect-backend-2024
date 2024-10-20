package com.example.backend.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") //  Applies to all routes
                        .allowedOrigins("http://localhost:3000") //  URL of your frontend
                        .allowedMethods("GET", "POST", "PUT", "DELETE") //  Allowed methods
                        .allowedHeaders("*") // Allowed headers
                        .allowCredentials(true); // Allow sending cookies and credentials
            }
        };
    }
}
