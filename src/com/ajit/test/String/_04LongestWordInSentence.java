package com.ajit.test.String;

import java.util.Arrays;
import java.util.Scanner;

public class _04LongestWordInSentence {
    public static void main(String[] args) {
        // Find the longest word in a sentence.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        System.out.println("Longest Word is : " + longestWord);
    }
}
/*
Output:
    Enter a Sentence: I love Coding
    Longest Word is : Coding
 */