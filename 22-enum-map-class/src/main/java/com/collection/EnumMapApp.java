package com.collection;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapApp {

    // create data enum
    public static enum Level {
        FREE, STANDARD, PREMIUM, VIP
    }

    public static void main(String[] args) {

        // create object map menggunakan implementasi EnumMap
        Map<Level, String> map = new EnumMap<Level, String>(Level.class);

        // add data, key berupa data enum, dan valuenya bisa diisi terserah
        map.put(Level.FREE, "Albert");
        map.put(Level.STANDARD, "Faraday");
        map.put(Level.VIP, "Tesla");
        map.put(Level.PREMIUM, "Thomas");

        // get all key from map
        for (var key : map.keySet()) {
            System.out.println("Key Enum : " + key);
        }

        // ambil data value berdasarkan key nya
        System.out.println(map.get(Level.FREE));
    }
}
