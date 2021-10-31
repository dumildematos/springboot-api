package com.amigoscode.springbootapi.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {


    public List<Student> getStudents () {
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "mariam@email.com",
                        21,
                        LocalDate.of(1992,1,2)
                )
        );
    }

}
