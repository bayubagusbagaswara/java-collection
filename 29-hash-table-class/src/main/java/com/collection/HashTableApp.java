package com.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {

        // create object map menggunakan implementasi HashTable
        Map<String, String> map = new Hashtable<>();
        map.put("albert", "Albert");
        map.put("tesla", "Tesla");
        map.put("gosling", "Gosling");
        map.put("faraday", "Faraday");
        map.put("galileo", "Galileo");

        // get all data
        for (var key : map.keySet()) {
            System.out.println("Key " + key);
        }
    }
}
