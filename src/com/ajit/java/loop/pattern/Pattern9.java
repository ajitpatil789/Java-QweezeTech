package com.ajit.java.loop.pattern;

public class Pattern9 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print((char) (i + 65));
            }
            System.out.println();
        }
    }
}
