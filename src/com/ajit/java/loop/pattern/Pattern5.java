package com.ajit.java.loop.pattern;

public class Pattern5 {
    public static void main(String[] args) {
        //2. Number Half Pyramid
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
//output :
//1
//12
//123
//1234