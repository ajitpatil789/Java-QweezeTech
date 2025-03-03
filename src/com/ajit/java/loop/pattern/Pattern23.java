package com.ajit.java.loop.pattern;

public class Pattern23 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i <= n; i++) {
            int first = 0;
            int second = 1;
            int result = 0;
            for (int j = 1; j <= i; j++) {
                first = second;
                second = result;
                System.out.print(result + " ");
                result = first + second;
            }

            System.out.println();
        }
    }
}
