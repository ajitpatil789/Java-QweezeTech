package com.ajit.java.Array;

public class ForEachExample {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        String[] str = {"Ajit", "Prakash", "Patil"};
        System.out.println("Numbers are:");
        for (int num : arr) {
            System.out.println(num + " ");
        }
        System.out.println("Strings are: ");
        for (String names : str) {
            System.out.println(names + " ");
        }
    }
}
