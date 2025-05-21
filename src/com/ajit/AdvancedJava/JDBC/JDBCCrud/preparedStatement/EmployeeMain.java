package com.ajit.AdvancedJava.JDBC.JDBCCrud.preparedStatement;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();
//        dao.addEmployee(11, "Sam", "Backend", 50000);
//        dao.showEmployees();
//        dao.updateEmployee(1, "Senior Developer");
        dao.deleteEmployee(11);
    }
}
