package com.ajit.java.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

class StringLenthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}

public class ListSortUsingComparator {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("banana", "apple", "date");
        strings.sort((a, b) -> b.length() - a.length());
        System.out.println(strings);


        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(100);
        list.add(50);
        list.sort((a, b) -> b - a);
        System.out.println(list);
    }
}
