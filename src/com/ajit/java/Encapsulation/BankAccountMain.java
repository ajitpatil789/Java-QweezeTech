package com.ajit.java.Encapsulation;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("34186645398", 50000);
        bankAccount.displayAccountDetails();
        bankAccount.deposit(5000);
        bankAccount.withdraw(2000);
        System.out.println("Final Balance: ₹" + bankAccount.getBalance());

    }
}
