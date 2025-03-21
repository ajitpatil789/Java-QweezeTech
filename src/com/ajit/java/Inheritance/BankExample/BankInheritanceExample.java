package com.ajit.java.Inheritance.BankExample;

// Base Class
class Bank {
    int accNumber;
    double balance;


    public Bank(int accNumber, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }


    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ". Updated Balance: " + balance);
    }

    public void withdraw(double amount) {
        double minBalance = 5000;
        if (amount <= minBalance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". Updated Balance: " + balance);
        } else {
            System.out.println("Insufficient balance! Withdrawal failed.");
        }
    }


    public void displayAccountDetails() {
        System.out.println("Account Number: " + accNumber);
        System.out.println("Balance: " + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends Bank {
    double interestRate;

    // Constructor
    public SavingsAccount(int accNumber, double balance, double interestRate) {
        super(accNumber, balance);
        this.interestRate = interestRate;
    }

    // Method to calculate interest
    public double calculateInterest() {
        return balance * interestRate / 100;
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Calculated Interest: " + calculateInterest());
    }
}


public class BankInheritanceExample {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(101, 5000.0, 4.0);

        System.out.println("Savings Account Details:");
        savings.displayAccountDetails();

        System.out.println("\nPerforming Transactions:");
        savings.deposit(2000.0);
        savings.withdraw(3000.0);
        savings.withdraw(7000.0);
    }
}

