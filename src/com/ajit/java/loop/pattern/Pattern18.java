package com.ajit.java.loop.pattern;

public class Pattern18 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((i) % 2);
            }
            System.out.println();
        }
    }
}
