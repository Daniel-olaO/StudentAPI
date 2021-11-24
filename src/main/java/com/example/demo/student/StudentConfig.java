package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam102@gmail.com",
                    LocalDate.of(1996, JUNE,6)
            );
            Student alex = new Student(
                    "Alex",
                    "alex.102@gmail.com",
                    LocalDate.of(2002, MARCH,6)
            );
            studentRepository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }
}
