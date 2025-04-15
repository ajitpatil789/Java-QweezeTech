package com.ajit.java.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class TheArrayList {
    public static void main(String[] args) {
        // insertion order maintain
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.remove(2);  // remove index 2
        list.remove(Integer.valueOf(20)); // it removes 20 from list
        Object[] array = list.toArray(); // convert into array // object array
        Integer[] array1 = list.toArray(new Integer[0]);   // convert int Ineger array
        System.out.println("ArrayList :" + list);
        System.out.println(list.get(2));
        Collections.reverse(list);
        System.out.println("Reverse: " + list);
        int n = Collections.max(list);
        System.out.println("max:" + n);

        ArrayList<String> colors = new ArrayList<>();
        colors.add("yellow");
        colors.add("black");
//        colors.addAll(list);
        System.out.println(colors.contains("black"));
        System.out.println("ArrayList :" + colors);

        Vector vector = new Vector<>();
        vector.add(25);
        vector.add("ABC");
        vector.add(14.5);
        System.out.println("Vector :" + vector);

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//
        for (int num : list) {
            System.out.println(num);
        }
        list.forEach(System.out::println);

    }
}
