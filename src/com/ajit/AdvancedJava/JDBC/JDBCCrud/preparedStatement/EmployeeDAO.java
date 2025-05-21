package com.ajit.AdvancedJava.JDBC.JDBCCrud.preparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {
    private final Connection connection;

    public EmployeeDAO() {
        this.connection = DBConnection.getConnection();
    }

    public void addEmployee(int id, String name, String department, double salary) {
        String query = "INSERT INTO employee (id, name, department, salary) values(?,?,?,?)";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setString(3, department);
            statement.setDouble(4, salary);
            int rows = statement.executeUpdate();
            System.out.println("✅ Employee added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void showEmployees() {
        String query = "SELECT * FROM employee";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String department = resultSet.getString("department");
                double salary = resultSet.getDouble(4);
                System.out.println(id + " | " + name + " | " + department + " | " + salary);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateEmployee(int id, String newDepartment) {
        String query = "UPDATE employee SET department = ? WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, newDepartment);
            pstmt.setInt(2, id);
            int rows = pstmt.executeUpdate();
            System.out.println("✅ Employee updated successfully! Rows affected: " + rows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteEmployee(int id) {
        String query = "DELETE FROM employee WHERE id = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            int rows = statement.executeUpdate();
            System.out.println("✅ Employee deleted successfully! Rows affected: " + rows);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
