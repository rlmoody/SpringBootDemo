package com.moody.demo.rest;

import com.moody.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

        // check studentId against list size
        if ( (studentId >= theStudents.size()) || (studentId < 0)) {
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }

        // index into list of students
        return theStudents.get(studentId);
    }



}














