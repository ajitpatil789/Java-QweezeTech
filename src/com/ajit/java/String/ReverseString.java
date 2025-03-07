package com.ajit.java.String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string to reverse: ");
        String next = scanner.next();
        String reverse = "";
        for (int i = next.length() - 1; i >= 0; i--) {
            reverse += next.charAt(i);
        }
        System.out.println("Reverse String : " + reverse);

    }
}
