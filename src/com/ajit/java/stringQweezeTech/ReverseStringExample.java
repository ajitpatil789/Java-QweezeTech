package com.ajit.java.stringQweezeTech;

import java.util.Scanner;

public class ReverseStringExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string to reverse: ");
        String next = scanner.next();
        System.out.println("Reverse String is : " + reverseString(next));
    }

    public static String reverseString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }
        return reverse;
    }
}
