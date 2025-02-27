package com.ajit.java.loop.pattern;

public class Pattern7 {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        int first = 0, second = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(first + " ");
                int next = first + second;
                first = second;
                second = next;
            }
            System.out.println();
        }
    }
}