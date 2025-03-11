package com.ajit.java.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        String[] str = new String[size];
        System.out.println("Enter Strings:");
        for (int i = 0; i < size; i++) {
            str[i] = sc.next();
        }
        System.out.println("Names entered:");
//        for (int i = 0; i < str.length; i++) {
//            System.out.println(str[i]);
//        }
//        for (String a : str) {
//            System.out.println(a);
//        }
//        System.out.println(Arrays.toString(str));
//        Arrays.stream(str).forEach(System.out::println);
        System.out.println(Arrays.asList(str));
        System.out.println("Length: " + str.length);
//        ArrayOfString ofString = new ArrayOfString();
//        System.out.println(ofString.toString());
    }
}

