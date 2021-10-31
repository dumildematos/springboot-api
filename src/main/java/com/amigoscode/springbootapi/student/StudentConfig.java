package com.amigoscode.springbootapi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam@email.com",
                    21,
                    LocalDate.of(1992, JANUARY, 2)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    21,
                    LocalDate.of(2004, JANUARY, 2)
            );

            repository.saveAll(
                    List.of(mariam, alex)
            );

        };
    }

}
