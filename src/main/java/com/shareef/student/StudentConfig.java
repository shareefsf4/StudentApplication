package com.shareef.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {

                   Student shareef= new Student(
                            "shareef",
                            "shareef1@gmail.com",

                            LocalDate.of(2000, JULY,7));
          Student Sriya=  new Student(
                    "Sriya",
                    "sriya@gmail.com",

                    LocalDate.of(2001,MARCH,10));
            repository.saveAll(List.of(shareef,Sriya));

        };
    };
}
