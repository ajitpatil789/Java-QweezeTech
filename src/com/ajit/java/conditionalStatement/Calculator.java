package com.ajit.java.conditionalStatement;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;
        while (continueCalculation) {
            System.out.println("Simple calculator");
            System.out.print("Enter First Number: ");
            double number1 = scanner.nextInt();
            System.out.print("Enter Second Number: ");
            double number2 = scanner.nextInt();
            System.out.print("Choose an operation : (+, -, *, /) : ");
            char operator = scanner.next().charAt(0);
            double result;

            switch (operator) {
                case '+':
                    result = number1 + number2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = number1 - number2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = number1 * number2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if (number2 != 0) {
                        result = number1 / number2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Devide by zeo");
                    }
                    break;
                default:
                    System.out.println("Invalid operator! Please use +, -, *, or /.");

            }
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String choice = scanner.next().toLowerCase();
            if (!choice.equals("yes")) {
                continueCalculation = false;
            }
        }
        System.out.println("Thank you for using the calculator. Goodbye!");
        scanner.close();

    }
}
