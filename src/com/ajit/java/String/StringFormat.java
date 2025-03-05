package com.ajit.java.String;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Ajit";
        int age = 28;
        String formatted = String.format("My name is %s and age is %d", name, age);
        System.out.println(formatted);
    }
}
