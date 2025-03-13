package com.ajit.java.loop.forloop;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        System.out.print("Enter Range : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;    //
        for (int i = 1; i <= n; i++) {
//            sum += i;
            sum = sum + i;

        }
        System.out.println("Sum: " + sum);
    }
}
