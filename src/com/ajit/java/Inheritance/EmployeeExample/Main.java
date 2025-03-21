package com.ajit.java.Inheritance.EmployeeExample;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer("Alex", 100, 25000, "Java");
        Manager manager = new Manager("Tom", 101, 50000, 10000);
        System.out.println("Developer: ");
        developer.show();
        System.out.println("Manager: ");
        manager.show();
//        System.out.println(developer);
//        System.out.println(manager);
    }
}
