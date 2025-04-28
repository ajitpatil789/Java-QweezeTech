package com.ajit.test.oopsPractice.BankManagementSystem;

public class Bank {
    public static void main(String[] args) {
        SavingAccount account = new SavingAccount("34186645398", 5000.00);
        account.deposite(2000);
        account.withdraw(1000);
    }
}
