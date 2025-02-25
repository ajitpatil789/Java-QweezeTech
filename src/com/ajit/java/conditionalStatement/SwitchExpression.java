package com.ajit.java.conditionalStatement;

import java.util.Scanner;

public class SwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        String result = switch (choice) {
            case 1 -> "Projector is ON";
            case 2 -> "Projector is OFF";
            case 3 -> "Light is ON";
            default -> "Invalid choice";
        };
        System.out.println(result);
    }
}
