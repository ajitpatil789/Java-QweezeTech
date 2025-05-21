package com.ajit.AdvancedJava.JDBC.JDBCCrud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudData {
    static Connection conn = DBConnection.getConnection(); // Use shared connection

    public static void addstudent() {
        String query = "INSERT INTO student(id,name,course)values(1,'Ajit','jdbc'),(2,'Vihaan','java')";

        try {
            Statement stmt = conn.createStatement();
            int rows = stmt.executeUpdate(query);
            System.out.println("✅ Student added successfully!");


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void showStudent() {
        String query = "select * from student";

        try {
            Statement stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery(query);

            while (resultSet.next()) {
                System.out.printf("%d\t%-10s\t%-10s\n", resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("course"));

            }

            resultSet.close();
            conn.close();


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void updateStudent() {
        String sql = "UPDATE student SET course = 'Angular' WHERE id = 1";
        try {
            Statement statement = conn.createStatement();
            int rows = statement.executeUpdate(sql);
            System.out.println("Student Updated...");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void deleteStudent() {
        String sql = "DELETE FROM student WHERE id = 2";
        try {
            Statement statement = conn.createStatement();
            int rows = statement.executeUpdate(sql);
            System.out.println("Record is deleted..");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
//        addstudent();
//        showStudent();
//        updateStudent();
        deleteStudent();
    }
}
