package com.moody.demo.entity;

public class Student {

    private String firstName;
    private String lastName;

    public Student() {

    }

    public Student(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
