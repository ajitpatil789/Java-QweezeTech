package com.ajit.AdvancedJava.JDBC.JDBCCrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/collegedata";
    private static final String USER = "root";
    private static final String PASS = "root";

    private static Connection connection;

    public DBConnection() {
    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USER, PASS);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                throw new RuntimeException("MySQL Driver not found", e);
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Database connection failed", e);
            }
        }
        return connection;
    }
}