package com.ajit.test.String;

import java.util.Scanner;

public class _03CountVowels {
    public static void main(String[] args) {
        // Count the number of vowels (a, e, i, o, u) in a given string.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scanner.next();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);

        String str1 = "ajitpatil";
        int length = str1.replaceAll("[^aeiouAEIOU]", "").length(); //^ (caret) at the beginning negates the set, meaning "match everything except vowels."
        System.out.println(length);
    }
}
/*
Output :
    Enter a String: ajit
    Number of vowels: 2
 */