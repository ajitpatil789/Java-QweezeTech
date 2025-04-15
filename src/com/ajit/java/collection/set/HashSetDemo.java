package com.ajit.java.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
        //insertion order not maintained
        // duplicate not allowed
        // serching not possible
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println(set);
//        set.remove(30);
        System.out.println(set);

        TreeSet<Integer> treeSet = new TreeSet<>();   // automatic sorting happen
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        System.out.println(treeSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(); // insertion order maintained
        linkedHashSet.add(91);
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(90);
        linkedHashSet.add(30);
        linkedHashSet.add(10);
        linkedHashSet.add(40);
        System.out.println(linkedHashSet);

        for (int num : linkedHashSet) {
            System.out.println(num);
        }

    }
}
