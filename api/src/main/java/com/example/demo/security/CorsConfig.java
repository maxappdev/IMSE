package com.example.demo.security;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.*;

/*
https://stackoverflow.com/questions/52047548/response-for-preflight-does-not-have-http-ok-status-in-angular TODO: citate
 */
@Configuration
public class CorsConfig {

  @Bean
  public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurerAdapter() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedMethods("GET", "POST", "PUT", "DELETE").allowedOrigins("*")
            .allowedHeaders("*");
      }
    };
  }
}
