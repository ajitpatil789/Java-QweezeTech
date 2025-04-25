package com.ajit.test.oopsPractice.SchoolManagementSystem;

public class Teacher extends Person {
    String subject;

    public Teacher(int age, String name, String subject) {
        super(age, name);
        this.subject = subject;
    }

    void teach() {
        System.out.println(name + " is teaching " + subject);
    }
}
