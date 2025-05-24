package com.example.day5_java_api_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@EnableFeignClients
public class Maven1Application{

    public static void main(String[] args) {
        SpringApplication.run(Maven1Application.class, args);
    }
}