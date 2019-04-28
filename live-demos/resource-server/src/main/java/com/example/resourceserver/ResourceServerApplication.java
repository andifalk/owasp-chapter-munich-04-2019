package com.example.resourceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
public class ResourceServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(ResourceServerApplication.class, args);
  }
}
