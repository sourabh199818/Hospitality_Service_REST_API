package org.example;

import org.example.model.Patient;
import org.example.repository.PatientRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class Main {

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
        System.out.println("Hello and welcome!");
    }
}
