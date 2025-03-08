package com.ajit.java.String;

import java.util.Arrays;

public class ToStringExample {
    public static void main(String[] args) {
        String[] names = {"Ajit", "Vihaan", "Sneha", "Akshay"};
//        System.out.println(Arrays.toString(names));
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
