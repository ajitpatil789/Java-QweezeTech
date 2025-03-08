package com.ajit.test.String;

import java.util.Scanner;

public class _05CapitlizeFirstLetterOfWords {
    public static void main(String[] args) {
        // Convert a string to title case (capitalize the first letters of each word)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        String capital = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                capital += Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1).toLowerCase() + " ";
            }
        }

        System.out.println("Capitalized First Letter: " + capital.trim());
    }
}

/*
Output:
    Enter a Sentence: i love programing
    Title Case Sentence: I Love Programing
 */