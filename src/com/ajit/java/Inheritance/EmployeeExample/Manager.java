package com.ajit.java.Inheritance.EmployeeExample;

public class Manager extends Employeee {
    private double bonus;

    public Manager(String name, int id, int salary) {
        super(name, id, salary);
    }

    public Manager(String name, int id, int salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                '}';
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Bonus : " + bonus);
    }
}
