package com.moody.demo.rest;

import com.moody.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    @PostConstruct
    public void loadData() {

       theStudents = new ArrayList<>();

        theStudents.add(new Student("Robert", "Moody"));
        theStudents.add(new Student("Daryl", "Hall"));
        theStudents.add(new Student("John", "Oates"));

    }

    @GetMapping("/students")
    public List<Student> getStudents() {

        // return list of students
        return theStudents;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        // index into list of students
        return theStudents.get(studentId);
    }

}
