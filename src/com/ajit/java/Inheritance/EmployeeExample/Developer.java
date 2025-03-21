package com.ajit.java.Inheritance.EmployeeExample;

public class Developer extends Employeee {
    private String skills;

    public Developer(String name, int id, double salary) {
        super(name, id, salary);
    }

    public Developer(String name, int id, double salary, String skills) {
        super(name, id, salary);
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "skills='" + skills + '\'' +
                '}';
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Skills : " + skills);
    }
}
