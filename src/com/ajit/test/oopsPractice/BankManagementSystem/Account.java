package com.ajit.test.oopsPractice.BankManagementSystem;

public abstract class Account {
    String accNumber;
    double balance;

    public Account(String accNumber, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    abstract void deposite(double amount);

    abstract void withdraw(double amount);
}
