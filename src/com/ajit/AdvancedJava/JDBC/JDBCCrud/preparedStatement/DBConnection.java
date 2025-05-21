package com.ajit.AdvancedJava.JDBC.JDBCCrud.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/emp";
    private static final String USER = "root";
    private static final String PASS = "root";

    private static Connection connection;

    private DBConnection() {
    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USER, PASS);
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException("Database connection failed", e);
            }
        }
        return connection;
    }
}