package com.ajit.java.String;

public class StringToCharArray {
    public static void main(String[] args) {
        String s = "Java";
        char[] array = s.toCharArray();
        for (char arr : array) {
            System.out.print(arr + " ");
        }
    }
}
