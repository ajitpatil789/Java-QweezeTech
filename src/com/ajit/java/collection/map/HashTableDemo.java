package com.ajit.java.collection.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    /*
    🧠 What is Hashtable?

Hashtable is a Map that stores key-value pairs.

Synchronized (Thread-safe) ✅

No null keys or null values allowed ❌

Keys and values are not ordered.

Slower than HashMap because of synchronization.
     */
    public static void main(String[] args) {
        Hashtable<Integer, String> students = new Hashtable<>();

        students.put(1, "Ajit");
        students.put(2, "Rahul");
        students.put(3, "Sneha");
//        System.out.println(students);

        for (Map.Entry<Integer, String> stud : students.entrySet()) {
            System.out.println("Key : " + stud.getKey() + " -> " + "Values " + stud.getValue());
        }


    }
}
