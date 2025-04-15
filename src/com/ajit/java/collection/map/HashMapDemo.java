package com.ajit.java.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/*
🧠 What is a Map in Java?
A Map is a key-value pair collection.
Example: Think of a real dictionary:
"apple" → "a fruit"
"java" → "a programming language"
In Java, commonly used Maps are:
HashMap → No order
LinkedHashMap → Insertion order preserved
TreeMap → Sorted by keys

🧠 What is HashMap?

A HashMap is a key-value pair collection.4

It does NOT maintain any order.

Allows null keys (only one) and multiple null values.

Not synchronized (not thread-safe by default).

Very fast for search, insert, and delete (on average O(1)).


 */

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Ajit");
        hashMap.put(2, "Rohan");
        hashMap.put(3, "Sanket");
        hashMap.put(4, "Vihaan");
        hashMap.put(5, "Rohan");
        hashMap.put(6, "Ajit");
//        System.out.println(hashMap);
//        System.out.println();
//        for (Integer key : hashMap.keySet()) {
//            System.out.println(key);
//        }
//        System.out.println();
//
//        for (String value : hashMap.values()) {
//            System.out.println(value);
//        }
//        System.out.println();
//
        for (Map.Entry<Integer, String> keyValues : hashMap.entrySet()) {
            System.out.println(keyValues);
        }
//        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<Integer, String> entry = iterator.next();
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//        }
    }
}
