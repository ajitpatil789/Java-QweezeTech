package com.ajit.java.loop.whileLoop;

public class WhileLoopDemo {
    public static void main(String[] args) {
        System.out.println("Using While Loop");
        int i = 1;
        while (i <= 10) {
            System.out.println(i * 2);
            i++;
        }
        System.out.println("****************************************************");
        System.out.println("Using Do While Loop");

        int j = 1;
        do {

            System.out.println(j * 2);
            j++;
        } while (j <= 10);
    }
}
