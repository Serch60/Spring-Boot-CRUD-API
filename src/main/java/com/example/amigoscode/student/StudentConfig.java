package com.example.amigoscode.student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student serch = new Student(
                    "Sergio",
                    "serch60@gmail.com",
                    LocalDate.of(1997, Month.MAY, 11)
            );

            Student alex = new Student(
                    "Alex",
                    "alex70@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 5)
            );

            repository.saveAll(
                    List.of(serch, alex)
            );
        };
    }
}
