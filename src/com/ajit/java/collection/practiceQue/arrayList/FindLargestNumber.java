package com.ajit.java.collection.practiceQue.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindLargestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(10, 50, 85, 75));
        int max = Collections.max(num);
        System.out.println(max);

        ArrayList<Integer> cloneArray = (ArrayList<Integer>) num.clone();
        System.out.println(cloneArray);

        Integer[] arr = cloneArray.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
    }
}
