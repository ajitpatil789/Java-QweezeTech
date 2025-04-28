package com.ajit.AdvancedJava.JDBC;

public class JdbcExample {
    public static void main(String[] args) {
        try {
            // Step 1: Load and Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create Connection
            String url = "jdbc:mysql://localhost:3306/emp";

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
