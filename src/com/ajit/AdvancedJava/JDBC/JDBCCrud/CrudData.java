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

    public static void main(String[] args) {
//        addstudent();
        showStudent();
    }
}
