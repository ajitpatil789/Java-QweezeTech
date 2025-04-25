package com.ajit.test.oopsPractice.SchoolManagementSystem;

public class Student extends Person {
    int rollNumber;

    public Student(int age, String name, int rollNumber) {
        super(age, name);
        this.rollNumber = rollNumber;
    }

    void study() {
        System.out.println(name + " is Studying");
    }
}
