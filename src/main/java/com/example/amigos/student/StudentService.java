package com.example.amigos.student;

import org.springframework.stereotype.Service;

import java.time.*;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Elissa",
                        "elissa.dusabe@gmail.com",
                        LocalDate.of(2000, Month.JULY, 5),
                        21

                )
        );
    }
}
