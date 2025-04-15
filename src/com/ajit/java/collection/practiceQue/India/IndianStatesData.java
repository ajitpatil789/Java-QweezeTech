package com.ajit.java.collection.practiceQue.India;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndianStatesData {

    // Data for Maharashtra cities
    public ArrayList<String> getMaharashtraCities() {
        ArrayList<String> maharashtra = new ArrayList<>();
        maharashtra.add("Kolhapur");
        maharashtra.add("Sangli");
        maharashtra.add("Satara");
        return maharashtra;
    }

    // Data for Karnataka cities
    public ArrayList<String> getKarnatakaCities() {
        ArrayList<String> karnataka = new ArrayList<>();
        karnataka.add("Bengaluru");
        karnataka.add("Mysuru");
        karnataka.add("Belagavi");
        return karnataka;
    }

    // Data for Kerala cities
    public ArrayList<String> getKeralaCities() {
        ArrayList<String> kerala = new ArrayList<>();
        kerala.add("Kasaragod");
        kerala.add("Kannur");
        kerala.add("Kozhikode");
        return kerala;
    }

    // Map of all states and their cities
    public Map<String, List<String>> getAllStates() {
        Map<String, List<String>> states = new HashMap<>();
        states.put("Maharashtra", getMaharashtraCities());
        states.put("Karnataka", getKarnatakaCities());
        states.put("Kerala", getKeralaCities());
        return states;
    }

    // Map of India containing all states and their cities
    public Map<String, Map<String, List<String>>> getIndia() {
        Map<String, Map<String, List<String>>> indianStates = new HashMap<>();
        indianStates.put("India", getAllStates());
        return indianStates;
    }

    public static void main(String[] args) {
        IndianStatesData data = new IndianStatesData();
        Map<String, List<String>> allStates = data.getAllStates();
        for (Map.Entry<String, List<String>> state : allStates.entrySet()) {
            System.out.println("State : " + state);
        }
        Map<String, Map<String, List<String>>> india = data.getIndia();
        for (Map.Entry<String, Map<String, List<String>>> indiaData : india.entrySet()) {
            System.out.println("Indian Data : " + indiaData);
        }
    }
}