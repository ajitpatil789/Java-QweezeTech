package com.ajit.java.collection.practiceQue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IPL {
    public static void main(String[] args) {
        List<String> rcb = new ArrayList<>();
        rcb.add("Virat");
        rcb.add("Padikal");
        rcb.add("Rajat");
        List<String> csk = new ArrayList<>(List.of("MSD", "Ruturaj", "Jadeja"));
        List<String> mi = new ArrayList<>(List.of("rohit", "hardik", "bumrah"));
//        System.out.println(csk);
//        System.out.println(rcb);
//        System.out.println(mi);
        Map<String, List<String>> iplteams = new HashMap<>();
        iplteams.put("RCB", rcb);
        iplteams.put("CSK", csk);
        iplteams.put("MI", mi);
        System.out.println(iplteams);
    }
}
