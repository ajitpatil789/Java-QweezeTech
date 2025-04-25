package com.ajit.test.oopsPractice.SchoolManagementSystem;

public class Person {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void introduce() {
        System.out.println("Hi i am " + name + " , age is " + age);
    }
}
