package ru.max.lsn1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("1", 20);
        mp.put("2", 30);
        mp.put("3", 40);
        mp.put("4", 50);
        mp.put("5", 60);
        System.out.println(mp.get("5"));
        System.out.println(mp.get(6));
        if (mp.containsKey(6)) {
//            map.put(null, Collections.emptyList());
//            map.putIfAbsent("name", "Gus");
            mp.put("6", 6);
            System.out.println(mp);
        }
    }
}

