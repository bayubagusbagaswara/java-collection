package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryApp {
    public static void main(String[] args) {

        // create object map menggunakan implementasi HashMap()
        Map<String, String> map = new HashMap<>();
        map.put("albert", "Albert");
        map.put("gosling", "Gosling");
        map.put("faraday", "Faraday");
        map.put("thomas", "Thomas");
        map.put("tesla", "Tesla");

        // contoh method yang ada di map
        // keySet(), untuk mengambil semua Key, lalu menampunnya dalam bentuk Set
        // map.keySet();

        // values(), untuk mengambil semua Values, lalu menampungnya dalam bentuk Collection
        // map.values();

        // entrySet(), untuk mengambil data keduanya yakni Key dan Value
        // menampung datanya juga dalam bentuk Set Entry, beserta generic parameternya
        // map.entrySet();

        // entrySet() untuk mendapatkan data si Entry nya, dan hasilnya adalah Set dari si entry tersebut
        Set<Map.Entry<String, String>> entries = map.entrySet();

        // entry itu adalah Inner Interface, jadi dia ada di dalam Map

        // get data key and value
        for (var entry : entries) {
            System.out.println("Key " + entry.getKey() + " : " + "Value " + entry.getValue());
        }
    }
}
