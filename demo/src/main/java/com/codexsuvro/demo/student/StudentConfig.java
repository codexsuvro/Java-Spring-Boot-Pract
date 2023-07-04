package com.codexsuvro.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student suvro = new Student(
                    "Suvro",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    "codexsuvro@gmail.com"
            );

            Student cfl = new Student(
                    "CFL",
                    LocalDate.of(2001, Month.JANUARY, 5),
                    "cfl@gmail.com"
            );

            repository.saveAll(
                    List.of(suvro,cfl)
            );
        };
    }
}
