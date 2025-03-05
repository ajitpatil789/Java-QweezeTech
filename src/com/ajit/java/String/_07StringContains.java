package com.ajit.java.String;

public class _07StringContains {
    public static void main(String[] args) {
        String s = "I love Java!";
        System.out.println(s.contains("Java")); //true
        System.out.println(s.startsWith("I"));  //true
        System.out.println(s.endsWith("!")); // true
        System.out.println(s.replace("love", "code")); //I code Java!
    }
}
