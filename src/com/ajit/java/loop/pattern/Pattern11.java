package com.ajit.java.loop.pattern;

public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print((char) ('A' + i));
            }
            System.out.println();
        }
    }
}
