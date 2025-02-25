package com.ajit.java.conditionalStatement;

import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number is Even");
        } else
            System.out.println("Number is odd");
    }

}
