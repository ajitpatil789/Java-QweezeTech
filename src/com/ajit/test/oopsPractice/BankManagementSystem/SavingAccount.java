package com.ajit.test.oopsPractice.BankManagementSystem;

public class SavingAccount extends Account {

    public SavingAccount(String accNumber, double balance) {
        super(accNumber, balance);
    }

    @Override
    void deposite(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited : " + amount);
            System.out.println("Balance : " + balance);
        } else {
            System.out.println("Amount must be greater than 0");
        }
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw : " + amount);
            System.out.println("Balance : " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
