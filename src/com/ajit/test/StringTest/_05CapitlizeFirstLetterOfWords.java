package com.ajit.test.StringTest;

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
        // Split words using \\s+ to handle multiple spaces
//        String[] words = sentence.split("\\s+");
//        StringBuilder capitalizedSentence = new StringBuilder();
//
//        for (String word : words) {
//            if (!word.isEmpty()) { // Check if the word is not empty
//                capitalizedSentence.append(Character.toUpperCase(word.charAt(0)))
//                        .append(word.substring(1).toLowerCase())
//                        .append(" ");
//            }
//        }
//
//        // Print final capitalized sentence (trim to remove trailing space)
//        System.out.println("Capitalized First Letter: " + capitalizedSentence.toString().trim());
    }
}

/*
Output:
    Enter a Sentence: i love programing
    Title Case Sentence: I Love Programing
 */