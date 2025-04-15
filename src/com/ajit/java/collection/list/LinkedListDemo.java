package com.ajit.java.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add("ABC");
        list.add(10.50);
        list.add("Ajit");
        System.out.println(list);

        for (Object obj : list) {
            System.out.println(obj);
        }

        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 5, 7, 8, 3, 4));
        ArrayList<Integer> integers2 = new ArrayList<>(List.of(1, 5, 7, 8, 3, 4));
        System.out.println(integers);
        System.out.println(integers2);
    }
}
