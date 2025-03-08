package com.ajit.java.stringQweezeTech.test_prep;

import java.util.Scanner;

public class StringReplaceExa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String input = scanner.next();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'e') {
                result += 'i';
            } else {
                result += input.charAt(i);
            }
        }
        System.out.println(result);
    }


}
