package com.ajit.java.loop.pattern;

public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print((char) (j + 65));
            }
            System.out.println();
        }
    }
}
