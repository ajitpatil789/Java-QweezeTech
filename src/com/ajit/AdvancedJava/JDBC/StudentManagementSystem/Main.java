package com.ajit.AdvancedJava.JDBC.StudentManagementSystem;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDao dao = new StudentDao();
        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter course: ");
                    sc.nextLine();
                    String course = sc.nextLine();
                    dao.addStudent(new Student(name, age, course));
                    break;

                case 2:
                    List<Student> students = dao.getAllStudents();
                    System.out.println("\nID\tName\tAge\tCourse");
                    for (Student s : students) {
                        System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getCourse());
                    }
                    break;

                case 3:
                    System.out.print("Enter student ID to update: ");
                    int updateId = sc.nextInt();
                    System.out.print("Enter new name: ");
                    sc.nextLine();
                    String newName = sc.nextLine();
                    System.out.print("Enter new age: ");
                    int newAge = sc.nextInt();
                    System.out.print("Enter new course: ");
                    sc.nextLine();
                    String newCourse = sc.nextLine();
                    dao.updateStudent(new Student(updateId, newName, newAge, newCourse));
                    break;

                case 4:
                    System.out.print("Enter student ID to delete: ");
                    int deleteId = sc.nextInt();
                    dao.deleteStudent(deleteId);
                    break;

                case 5:
                    System.out.println("👋 Exiting... Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("❗ Invalid choice! Please try again.");
            }
        }
    }
}
