package com.ajit.test.String;

import java.util.Scanner;

public class _01ReverseString {
    public static void main(String[] args) {
        // Write a program to reverse a string without using built-in functions.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scanner.next();
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println("Reversed String is :" + reverse);
    }
}
/*
Output:
        Enter a String: ajit
        Reversed String is :tija
 */