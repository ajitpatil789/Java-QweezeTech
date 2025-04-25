package com.ajit.test.oopsPractice.SchoolManagementSystem;

public class SchoolMain {
    public static void main(String[] args) {
        Student student = new Student(20, "Ajit", 55);
        Teacher teacher = new Teacher(40, "Amar sir", "Math");
        student.introduce();
        student.study();
        teacher.introduce();
        teacher.teach();
    }
}
