package com.ajit.java.Encapsulation;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(100);
        employee.setName("Ajit Patil");
        employee.setSalary(50000.00);
        System.out.println("Employee Id : " + employee.getId());
        System.out.println("Employee Name : " + employee.getName());
        System.out.println("Employee Salary : " + employee.getSalary());
    }
}
