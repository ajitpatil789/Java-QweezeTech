package com.ajit.java.collection.practiceQue.India;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatesData {
    public static void main(String[] args) {
        // Data for Maharashtra cities
        ArrayList<String> maharashtra = new ArrayList<>();
        maharashtra.add("Kolhapur");
        maharashtra.add("Sangli");
        maharashtra.add("Satara");

        // Data for Karnataka cities
        ArrayList<String> karnataka = new ArrayList<>();
        karnataka.add("Bengaluru");
        karnataka.add("Mysuru");
        karnataka.add("Belagavi");

        // Data for Kerala cities
        ArrayList<String> kerala = new ArrayList<>();
        kerala.add("Kasaragod");
        kerala.add("Kannur");
        kerala.add("Kozhikode");

        // Map of all states and their cities
        Map<String, List<String>> states = new HashMap<>();
        states.put("Maharashtra", maharashtra);
        states.put("Karnataka", karnataka);
        states.put("Kerala", kerala);
        System.out.println("States: ");
        for (Map.Entry<String, List<String>> state : states.entrySet()) {
            System.out.println(state);
        }

        // Map of India containing all states and their cities
        Map<String, Map<String, List<String>>> indianStates = new HashMap<>();
        indianStates.put("India", states);

        System.out.println("India:");

        for (Map.Entry<String, Map<String, List<String>>> india : indianStates.entrySet()) {
            System.out.println(india);
        }

    }
}
