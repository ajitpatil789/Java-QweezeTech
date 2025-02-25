package com.ajit.java.conditionalStatement;

import java.util.Scanner;

public class IfElseLadder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Marks: ");
        int marks = scanner.nextInt();


        if (marks >= 80 && marks <= 100) {
            System.out.println("🏆 First Class! You scored " + marks + " marks.");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("🥈 Second Class! You scored " + marks + " marks.");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("✅ Pass! You scored " + marks + " marks.");
        } else if (marks < 0 || marks > 100) {
            System.out.println("❌ Invalid Input! Please enter marks between 0 to 100.");
        } else {
            System.out.println("❌ Failed.. Better luck next time!");
        }
        scanner.close();
    }
}