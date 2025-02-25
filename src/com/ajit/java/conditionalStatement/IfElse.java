package com.ajit.java.conditionalStatement;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("Enter Your Age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age > 18) {
            System.out.println("You will get Pan Card");
        } else System.out.println("Not Eligible");

    }
}
