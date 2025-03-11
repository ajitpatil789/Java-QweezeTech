package com.ajit.java.stringQweezeTech.StringBuilder;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello");
        System.out.println(builder.capacity());
        System.out.println(builder.append(" World"));
        System.out.println(builder.insert(6, " Java"));
        System.out.println(builder.reverse());

        StringBuilder builder1 = new StringBuilder("Programing");
        System.out.println(builder1.delete(0, 3));
        System.out.println(builder1.deleteCharAt(0));
        System.out.println(builder1.indexOf("i"));
        System.out.println(builder1.lastIndexOf("am"));
        System.out.println(builder.substring(2, 5));
        System.out.println(builder1.replace(3, 4, "emj"));

        String str = "Hello Java";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.replace(0, 6, "Hi "));


    }
}