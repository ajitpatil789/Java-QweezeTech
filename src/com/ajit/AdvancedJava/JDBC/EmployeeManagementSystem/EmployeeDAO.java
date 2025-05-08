package com.ajit.AdvancedJava.JDBC.EmployeeManagementSystem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    public void addEmployee(Employee employee) {
        String sql = "INSERT INTO employee(id, name, department, salary) values(?,?,?,?)";
        try {
            Connection conn = DBConnetion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, employee.getId());
            stmt.setString(2, employee.getName());
            stmt.setString(3, employee.getDepartment());
            stmt.setDouble(4, employee.getSalary());
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();
        String sql = "SELECT * FROM employee";
        try (Connection conn = DBConnetion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql);
        ) {
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getInt("id"));
                employee.setName(rs.getString("name"));
                employee.setDepartment(rs.getString("department"));
                employee.setSalary(rs.getDouble("salary"));
                list.add(employee);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public Employee getEmployeeById(int id) {
        String sql = "SELECT * FROM employee WHERE id = ?";
        Employee emp = null;

        try {
            Connection connection = DBConnetion.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                emp = new Employee();
                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setDepartment(rs.getString("department"));
                emp.setSalary(rs.getDouble("salary"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return emp;
    }

    public void updateEmployee(Employee employee) {
        String sql = "UPDATE employee SET name = ?, department = ?, salary = ? WHERE id = ?";
        try {
            Connection connection = DBConnetion.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, employee.getName());
            statement.setString(2, employee.getDepartment());
            statement.setDouble(3, employee.getSalary());
            statement.setInt(4, employee.getId());
            int rows = statement.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee updated successfully");
            } else {
                System.out.println("Employee not found");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteEmployee(int id) {
        String sql = "DELETE FROM employee WHERE id = ?";
        try {
            Connection connection = DBConnetion.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            int rows = statement.executeUpdate();
            if (rows > 0) {
                System.out.println("Employee deleted successfully");
            } else {
                System.out.println("Employee not found");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
