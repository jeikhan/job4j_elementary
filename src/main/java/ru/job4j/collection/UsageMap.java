package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("clarkson@topgear.com", "Jeremy Clarkson");
        map.put("hammond@topgear.com", "Richard Hammond");
        map.put("may@topgear.com", "James May");
        map.put("hammond@topgear.com", "Richard Hammond");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(value + " (" + key + ")");
        }
    }
}