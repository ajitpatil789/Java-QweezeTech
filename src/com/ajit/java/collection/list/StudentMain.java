package com.ajit.java.collection.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private double cgpa;

    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ajit", 78.50));
        students.add(new Student("Vihaan", 9.85));
        students.add(new Student("Sneha", 85.00));
        students.add(new Student("Pranav", 80.50));
        students.add(new Student("Akshit", 80.50));

//
//        students.sort((o1, o2) -> {
//            if (o2.getCgpa() - o1.getCgpa() > 0) {
//                return 1;
//            } else if (o2.getCgpa() - o1.getCgpa() < 0) {
//                return -1;
//            } else {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        Comparator<Student> comparing = Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getName);
        students.sort(comparing);

        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getCgpa());

        }
    }
}
