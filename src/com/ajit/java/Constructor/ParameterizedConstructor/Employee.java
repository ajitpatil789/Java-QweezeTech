package com.ajit.java.Constructor.ParameterizedConstructor;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Employee employee = new Employee(101, "Ajit", 500000);
        System.out.println(employee);
    }
}
