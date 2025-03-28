package com.ajit.test.string;

import java.util.Scanner;

public class _04LongestWordInSentence {
    public static void main(String[] args) {
        // Find the longest word in a sentence.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        String sentence = scanner.nextLine();
        scanner.close(); // Always close Scanner when done

        // Split based on non-word characters (spaces, punctuation, etc.)
        String[] words = sentence.split("\\W+");


        String longestWord = "";
        for (String word : words) { // Using enhanced for-loop
            System.out.println(word);
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Handle case where no valid word exists
        if (longestWord.isEmpty()) {
            System.out.println("No valid words found.");
        } else {
            System.out.println("Longest Word is: " + longestWord);
        }
    }
}
/*
Output:
    Enter a Sentence: I love Coding
    Longest Word is : Coding
 */