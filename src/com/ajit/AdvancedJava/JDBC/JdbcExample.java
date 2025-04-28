package com.ajit.AdvancedJava.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/*
   JDBC Steps (5 Major Steps)
🔵 Step 1: Load and Register Driver
🔵 Step 2: Create Connection
🔵 Step 3: Create Statement
🔵 Step 4: Execute Query
🔵 Step 5: Close Connection
*/

public class JdbcExample {
    public static void main(String[] args) {
        try {
            // Step 1: Load and Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create Connection
            String url = "jdbc:mysql://localhost:3306/emp";
            String username = "root";
            String password = "root";
            Connection con = DriverManager.getConnection(url, username, password);

            // Step 3: Create Statement
            Statement stmt = con.createStatement();

            // Step 4: Execute Query
            String query = "SELECT * FROM employee";
            ResultSet rs = stmt.executeQuery(query);

            // Execute update query
//            String update = "UPDATE employee SET designation ='Student' WHERE id = 5";
//            int rowsAffected = stmt.executeUpdate(update);
//            System.out.println("Rows updated: " + rowsAffected);

            // Step 5: Process Resultset
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String designation = rs.getString("designation");
                System.out.println(id + " | " + name + " | " + designation);
            }

            // Step 6: Close connection
            con.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
