package com.ajit.java.loop.pattern;

public class Pattern22 {
    public static void main(String[] args) {
        int n = 4;
        char letter = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(letter++);
            }
            System.out.println();
        }
    }
}