package com.ajit.java.loop.pattern;

public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(num + "  ");
                num += 2;
            }
            System.out.println();
        }

        System.out.println("********************************");
    }
}