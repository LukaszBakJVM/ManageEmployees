package com.example.manageEmployees;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling

@SpringBootApplication
public class ManageEmployeesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageEmployeesApplication.class, args);
    }

}
