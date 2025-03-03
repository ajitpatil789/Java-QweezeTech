package com.ajit.java.loop.pattern;

public class Pattern19 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print((j) % 2);
            }
            System.out.println();
        }
    }
}
