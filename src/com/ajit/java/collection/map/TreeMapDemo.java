package com.ajit.java.collection.map;

import java.util.Map;
import java.util.TreeMap;
/*
🧠 What is TreeMap?
TreeMap is a Map that stores keys in sorted (natural) order automatically.
Keys are sorted — values are not sorted.
Internally uses a Red-Black Tree (balanced BST).
null keys are not allowed (but null values are allowed).
 */

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        // sorting happen automatically
        treeMap.put(1, "Ajit");
        treeMap.put(2, "Rohan");
        treeMap.put(6, "Ajit");
        treeMap.put(3, "Sanket");
        treeMap.put(4, "Vihaan");
        treeMap.put(5, "Rohan");

//        System.out.println(treeMap);
        for (Map.Entry<Integer, String> tree : treeMap.entrySet()) {
            System.out.println(tree);
        }
    }
}
