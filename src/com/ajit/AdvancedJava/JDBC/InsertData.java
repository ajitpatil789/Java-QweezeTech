package com.ajit.AdvancedJava.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {
    public static void main(String[] args) {
        try {
            // Step 1: Load and Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create Connection
            String url = "jdbc:mysql://localhost:3306/jdbc_op";
            String username = "root";
            String password = "root";
            Connection con = DriverManager.getConnection(url, username, password);

            // Step 3: Create Statement
            Statement stmt = con.createStatement();

            // Step 4: Execute Query - INSERT DATA
            String query = "INSERT INTO student(id,name)values(1,'Ajit'),(2,'Vihaan')";
            int rows = stmt.executeUpdate(query);
            System.out.println("✅ Student added successfully!");

            // Step 5: Close connection
            con.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
