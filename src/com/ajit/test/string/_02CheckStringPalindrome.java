package com.ajit.test.string;

import java.util.Scanner;

public class _02CheckStringPalindrome {
    public static void main(String[] args) {
        // Check if a given string is a palindrome (reads the same forward and backward).
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scanner.next();
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not a Palindrome");
        }
    }
}

/*
Output:
    Enter a String: madam
    String is Palindrome
 */