package com.example.memberseatsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.example.memberseatsystem", "com.example.memberseatsystem.repositories"})
@SpringBootApplication
public class MemberseatsystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberseatsystemApplication.class, args);
    }
}

