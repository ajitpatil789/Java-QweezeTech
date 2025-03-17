package com.ajit.java.Encapsulation;

public class BankAccount {
    private String accNum;
    private double balance;

    public BankAccount(String accNum, double balance) {
        this.accNum = accNum;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }

    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: ₹" + amount);
            } else {
                System.out.println("Withdrawal amount must be positive.");
            }
        }

    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accNum);
        System.out.println("Current Balance: ₹" + balance);
    }

}
