package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(
        StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
				(long) 1,
				"Mariam",
				"mariam.jamal@gmail.com",
				LocalDate.of(2000,Month.JANUARY,5),
				21
            );
            Student alex = new Student(
				(long) 2,
				"Alex",
				"alex@gmail.com",
				LocalDate.of(2004,Month.JANUARY,5),
				17
            );
            repository.saveAll(
                Arrays.asList(mariam, alex)
            );
        };
    }
}
