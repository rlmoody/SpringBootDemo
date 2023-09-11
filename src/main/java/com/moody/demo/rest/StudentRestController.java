package com.moody.demo.rest;

import com.moody.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents() {

        List<Student> theStudents = new ArrayList<>();

        theStudents.add(new Student("Robert", "Moody"));
        theStudents.add(new Student("Daryl", "Hall"));
        theStudents.add(new Student("John", "Oates"));

        return theStudents;
    }
}
