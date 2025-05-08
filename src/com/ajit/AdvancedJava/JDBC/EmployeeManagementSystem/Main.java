package com.ajit.AdvancedJava.JDBC.EmployeeManagementSystem;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDAO dao = new EmployeeDAO();
        while (true) {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Update Employee Details");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    Employee newEmp = new Employee(id, name, dept, salary);
                    dao.addEmployee(newEmp);
                    break;

                case 2:
                    List<Employee> allEmployees = dao.getAllEmployees();
                    if (allEmployees.isEmpty()) {
                        System.out.println("No employees found.");
                    } else {
                        for (Employee e : allEmployees) {
                            System.out.println("ID: " + e.getId() +
                                    ", Name: " + e.getName() +
                                    ", Dept: " + e.getDepartment() +
                                    ", Salary: " + e.getSalary());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();
                    Employee emp = dao.getEmployeeById(searchId);
                    if (emp != null) {
                        System.out.println("ID: " + emp.getId());
                        System.out.println("Name: " + emp.getName());
                        System.out.println("Department: " + emp.getDepartment());
                        System.out.println("Salary: " + emp.getSalary());
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    // Check if employee exists
                    Employee existingEmp = dao.getEmployeeById(updateId);
                    if (existingEmp == null) {
                        System.out.println("Employee with ID " + updateId + " does not exist.");
                    } else {
                        System.out.print("Enter new Name: ");
                        String updateName = sc.nextLine();
                        System.out.print("Enter new Department: ");
                        String updateDept = sc.nextLine();
                        System.out.print("Enter new Salary: ");
                        double updateSalary = sc.nextDouble();

                        Employee updateEmp = new Employee(updateId, updateName, updateDept, updateSalary);
                        dao.updateEmployee(updateEmp);
                    }
                    break;

                case 5:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();
                    dao.deleteEmployee(deleteId);
                    break;

                case 6:
                    System.out.println("Exiting program.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
