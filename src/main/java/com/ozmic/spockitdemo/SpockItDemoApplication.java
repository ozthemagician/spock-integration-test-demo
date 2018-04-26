package com.ozmic.spockitdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;

@SpringBootApplication
public class SpockItDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpockItDemoApplication.class, args);
    }

    @Autowired
    EntityManager entityManager;
}
