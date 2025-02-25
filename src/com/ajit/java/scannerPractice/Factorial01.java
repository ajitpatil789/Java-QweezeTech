package com.ajit.java.scannerPractice;

import java.util.Scanner;

public class Factorial01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is : " + fact);
        //System.out.println(String.format("Factorial of %d is : %d", num, fact));

    }
}
