package com.ajit.java.VariablesAndDatatypes;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Subject Marks: ");
        int marks1 = scanner.nextInt();
        System.out.println("Enter Second Subject Marks: ");
        int marks2 = scanner.nextInt();
        System.out.println("Enter Third Subject Marks: ");
        int marks3 = scanner.nextInt();
        System.out.println("Enter Fourth Subject Marks: ");
        int marks4 = scanner.nextInt();
        int total = marks1 + marks2 + marks3 + marks4;
        float average = total / 4f;
        System.out.println("Average is : " + average);

        float percentage = (total / 400f) * 100;
        System.out.println("Percentage is: " + percentage);
        scanner.close();
    }
}