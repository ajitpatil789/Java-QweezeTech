package com.ajit.java.stringQweezeTech;

import com.sun.security.jgss.GSSUtil;

public class StringPractice {
    public static void main(String[] args) {
        String str = "Programing";
        String str1 = "ajit";
        System.out.println(str.charAt(1));
        System.out.println(str.toUpperCase());
        String s = str1.substring(0, 1).toUpperCase() + str1.substring(1);
        System.out.println(s);
        System.out.println("************************************************************************************************");
        String trim = "        patil   ";
        System.out.println(trim.trim());
        String course = "React";
        System.out.println(course.substring(0, 3));
        System.out.println(course.substring(2));

        System.out.println("************************************************************************************************");
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        System.out.println(s1 == s2); //true
        System.out.println(s1 == s3); // flase

        String s4 = "I love java";
        System.out.println(s4.replace("java", "javascript"));
        System.out.println(s4.startsWith("I")); //true
        System.out.println(s4.endsWith("java")); //true

        String aj = "   aj it patil   "; //ajitpatil
        String trim1 = aj.trim();
        System.out.println(trim1);
        String s5 = trim1.substring(0, 2) + trim1.substring(3, 5) + trim1.substring(6);
        System.out.println(s5);

        String s6 = "Hello";
        String s7 = "hello";
        System.out.println(s6.equalsIgnoreCase(s7)); // true Compares this String to another String, ignoring case considerations.
    }
}
