package com.ajit.java.loop.pattern;

public class Pattern20 {
    public static void main(String[] args) {
        char n = 'E';
        for (char i = 'A'; i <= n; i++) {
            for (char j = 'A'; j <= n; j++) {
                System.out.print(i);
                i++;
            }
            System.out.println();
        }
    }
}
