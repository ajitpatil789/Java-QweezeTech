package com.ajit.java.Constructor.ParameterizedConstructor;

public class EmployeeParameterizedConstructor {
    String name;
    int id;

    // Parameterized Constructor
    public EmployeeParameterizedConstructor(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("Parameterized Constructor Called!");
    }

    // Method to display details
    void display() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}
