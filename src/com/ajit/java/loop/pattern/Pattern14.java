package com.ajit.java.loop.pattern;

public class Pattern14 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
