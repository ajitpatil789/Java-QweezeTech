package com.ajit.java.String;

import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ");
        joiner.add("Pink").add("Orange").add("Yellow");
        System.out.println(joiner.toString());
    }
}
