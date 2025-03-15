package com.ajit.java.Constructor;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Ajit", 101, 450);
        Student student2 = new Student("Vihaan", 102);
        student1.display();
        System.out.println("********************************************************");
        student2.display();
    }
}
