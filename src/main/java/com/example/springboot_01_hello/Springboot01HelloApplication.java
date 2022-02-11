package com.example.springboot_01_hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Spring Boot的自动配置注解
public class Springboot01HelloApplication {

    //package：主类com.example.spring
    public static void main(String[] args) {
        SpringApplication.run(Springboot01HelloApplication.class, args);
    }

}
