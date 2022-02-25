package com.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    public static void main(String[] args) {

        // create object map menggunakan implementasi cass LinkedHashMap
        Map<String, String> map = new LinkedHashMap<>();

        // add data
        map.put("first", "Albert");
        map.put("last", "Faraday");
        map.put("middle", "Newton");

        // ambil data hanya key nya dengan menggunakan function keySet()
        Set<String> keys = map.keySet();

        for (var key : keys) {
            System.out.println(key);
        }

        // kalau kita ganti HashMap, datanya tidak akan terurut, pendistribusian key nya menggunakan hashCode
        // kalau menggunakan LinkedHashMap, datanya lebih terprediksi, karena urutannya akan sesuai dengan saat memasukkan datanya
    }
}
