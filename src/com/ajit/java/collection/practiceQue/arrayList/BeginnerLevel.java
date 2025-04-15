package com.ajit.java.collection.practiceQue.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BeginnerLevel {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Mumbai", "Delhi", "Pune", "Chennai", "Bangalore", "Kolkata", "Hyderabad", "Ahmedabad", "Indore", "Jaipur"));
        for (String city : cities) {
            System.out.println(city);
        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter City you want to search: ");
//        String search = scanner.next();
//        if (cities.contains(search)) {
//            System.out.println(search + " is in the city");
//        } else {
//            System.out.println(search + " is not in the city");
//        }
        cities.add("Kolhapur");
        System.out.println("New Added List" + cities);
        cities.remove("Pune");
        System.out.println("After Removed Pune " + cities);
        System.out.println("Size " + cities.size());
        cities.clear();
        System.out.println(cities);
    }
}
