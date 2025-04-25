package com.ajit.test.oopsPractice.finalStaticAndThis;

public class Student {
    final int rollNumber;
    static String college = "KIT";

    public Student(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    void display() {
        System.out.println("Roll Numbers : " + rollNumber);
        System.out.println("College name : " + college);
    }

    static void changeCollege(String name) {
        college = name;
    }

    public static void main(String[] args) {
        Student student = new Student(55);
        student.display();
        changeCollege("MIT");
        student.display();
    }
}
