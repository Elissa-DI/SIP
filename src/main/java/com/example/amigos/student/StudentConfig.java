package com.example.amigos.student;

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
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student elissa = new Student(
                    1L,
                    "Elissa",
                    "elissa.dusabe@gmail.com",
                    LocalDate.of(2006, JULY, 5)
            );

            Student alex = new Student(
                    1L,
                    "Alex",
                    "alex01.dusabe@gmail.com",
                    LocalDate.of(2000, SEPTEMBER, 5)

            );

            //This is where we save our students
            repository.saveAll(
                    List.of(elissa, alex)
            );
        };
    }
}
