package com.ajit.java.conditionalStatement;

import java.util.Scanner;

public class CheckNumberISPositiveOrNegative {
    public static void main(String[] args) {
        System.out.print("Enter Number :");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number >= 0) {
            System.out.println("Numbers is Positive");
        } else System.out.println("Numbers is Negative");
    }
}
