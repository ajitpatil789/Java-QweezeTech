package com.ajit.java.loop.forloop;

public class NaturalNumbersSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println(i);
        }
        System.out.println("Sum of 10 Natural Numbers : " + sum);
    }
}
