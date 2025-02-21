package com.ajit.java.methods;

public class Bank {
    public static int balance = 1000;

    // Method to withdraw an amount from the balance
    public void withdraw(int amount) {
        if (balance - amount >= 500) {
            balance -= amount;
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance to maintain minimum balance of 500");
        }
    }

    // Method to deposit an amount to the balance
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Remaining Balance: " + balance);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.withdraw(100);
        bank.withdraw(400);
//        bank.withdraw(100);
//        bank.withdraw(600);
        // bank.deposit(200);
        // Bank bank1 = new Bank();
        // bank1.withdraw(100);
        // bank1.deposit(100);
    }
}