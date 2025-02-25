package com.ajit.java.conditionalStatement;

import java.util.Scanner;

public class CheckNumbersIsGreater {
    public static void main(String[] args) {
        System.out.print("Enter First No :");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.print("Enter Second No :");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Numbers are equal");
        } else if (num1 > num2) {
            System.out.println("Number 1 is greater");
        } else if (num2 > num1) {
            System.out.println("Number second is greater");
        }

    }
}
