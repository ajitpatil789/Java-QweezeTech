package com.ajit.java.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;
/*
🧠 What is LinkedHashMap?

It's a Map that stores key-value pairs AND remembers the order you inserted them.

Internally uses a HashMap + Doubly Linked List (to maintain order).

So when you iterate, you get elements in the same order you put them.


 */

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // Insertion order maintained
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(2, "Rohan");
        linkedHashMap.put(1, "Ajit");
        linkedHashMap.put(6, "Ajit");
        linkedHashMap.put(3, "Sanket");
        linkedHashMap.put(4, "Vihaan");
        linkedHashMap.put(5, "Rohan");
//        System.out.println(linkedHashMap);

        for (Map.Entry<Integer, String> linked : linkedHashMap.entrySet()) {
            System.out.println(linked);
        }
    }
}
