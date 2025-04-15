package com.ajit.java.collection.practiceQue.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class CreateArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ajit");
        names.add("Vihaan");
        names.add("Roman");
        names.add("Ajit");
        names.add("Ajit");
        System.out.println(names);
        names.remove(4);
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);
        Collections.reverse(names);
        System.out.println("Reverse" + names);
        for (String name : names) {
            System.out.println(name);
        }
    }
}
