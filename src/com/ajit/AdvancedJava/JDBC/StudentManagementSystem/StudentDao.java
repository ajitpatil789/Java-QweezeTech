package com.ajit.AdvancedJava.JDBC.StudentManagementSystem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    private Connection con;

    public StudentDao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void addStudent(Student student) {
        String sql = "INSERT INTO students(name, age, course) values(?,?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, student.getName());
            pst.setInt(2, student.getAge());
            pst.setString(3, student.getCourse());
            pst.executeUpdate();
            System.out.println("✅ Student added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM students";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Student s = new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("course")
                );
                list.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void updateStudent(Student student) {
        String sql = "Update students SET name=?,age=?,course=? WHERE id=?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, student.getName());
            pst.setInt(2, student.getAge());
            pst.setString(3, student.getCourse());
            pst.setInt(4, student.getId());
            int rows = pst.executeUpdate();
            if (rows > 0) {
                System.out.println("✅ Student updated successfully!");
            } else {
                System.out.println("❌ Student not found!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id = ?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            int rows = pst.executeUpdate();
            if (rows > 0) {
                System.out.println("✅ Student deleted successfully!");
            } else {
                System.out.println("❌ Student not found!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
