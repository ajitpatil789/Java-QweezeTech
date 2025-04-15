package com.ajit.java.collection.set;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(15);
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(50);
        System.out.println(treeSet);
        treeSet.remove(15);
        System.out.println(treeSet);
       
    }
}
