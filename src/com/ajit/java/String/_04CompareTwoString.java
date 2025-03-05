package com.ajit.java.String;

public class _04CompareTwoString {
    public static void main(String[] args) {
        String s1 = "Java";  // String pool
        String s2 = "Java";
        String s3 = new String("Java"); // Heap memory
        System.out.println(s1 == s2); // true  pointing to same reference ,true (String Pool reference)
        System.out.println(s1 == s3); // false two different object || (Heap reference)

        // to compare content
        System.out.println(s1.equals(s2)); // true || (content comparison)
    }
}
