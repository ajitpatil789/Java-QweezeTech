
package com.ajit.java.stringQweezeTech;

import java.util.Scanner;

public class ReverseStringUsingStringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string to reverse: ");
        String next = scanner.next();
        System.out.println("Reverse String is : " + reverseString(next));
    }

    public static String reverseString(String input) {
        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString();
    }
}