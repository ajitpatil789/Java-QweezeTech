package com.ajit.java.collection.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(15);  // insertion order maintained
        linkedHashSet.add(5);
        linkedHashSet.add(10);
        linkedHashSet.add(1);
        linkedHashSet.add(50);
        linkedHashSet.add(50); // duplicate not allowed
        System.out.println(linkedHashSet);

        Set<String> set = new HashSet<>();
        set.add("Ajit");
        set.add("Vihaan");
        set.add("Sneha");
        System.out.println(set);

    }
}
