package com.ajit.java.loop.pattern.halfPyramid;

public class RightAlignedIncreasingAlphabetPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + i - 1));
            }
            System.out.println();
        }
    }
}
