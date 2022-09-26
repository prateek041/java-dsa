package com.prateek.learning.Hashmap;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> ids = new HashMap<>(); // inside diamond, we put what maps to what.
        ids.put("Prateek", 1);
        ids.put("singh", 2);
        ids.put("nihal", 3);
        System.out.println(ids);

        System.out.println(ids.get("Prateek"));

        System.out.println(ids.containsKey("singh"));

        ids.put("Prateek", 69);
        System.out.println(ids);

        ids.replace("singh", 23);
        System.out.println(ids);

        ids.putIfAbsent("neha", 420);
        System.out.println(ids);
    }
}
