package com.ajit.java.Constructor.DefaultConstructor;

public class EmployeeDefaultConstructor {
    String name;
    int id;

    // Default constructor
    public EmployeeDefaultConstructor() {
        name = "Ajit";
        id = 100;
        System.out.println("Default constructor called");
    }

    // Method to display details
    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}
