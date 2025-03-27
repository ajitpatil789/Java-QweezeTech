package com.ajit.java.Array._1DArray;

import java.util.Scanner;

public class DeleteArrayGT {
    public static void main(String[] args) {
        int loc;
        System.out.println("Enter the size of array");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] a = new int[size];
        System.out.println("Enter Array element");
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Enter the location");
        loc = scanner.nextInt();

        if (loc < 0 || loc >= size) {
            System.out.println("Invalid location");
        } else {
            for (int i = loc; i < size - 1; i++) {
                a[i] = a[i + 1];
            }
            size--;
            System.out.println("Updated Array:");
            for (int i = 0; i < size; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
}