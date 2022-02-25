package com.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
    public static void main(String[] args) {

        // create object sorted map
        SortedMap<String, String> sortedMap = new TreeMap<>();

        // add data
        // kalau Object String kan sudah ada bawaan Comparable, jadi tidak perlu Comparator manual
        sortedMap.put("galileo", "Galileo");
        sortedMap.put("faraday", "Faraday");
        sortedMap.put("tesla", "Tesla");
        sortedMap.put("albert", "Albert");
        sortedMap.put("thomas", "Thomas");

        // get all key data
        for (var key : sortedMap.keySet()) {
            System.out.println("Key : " + key);
        }

        System.out.println("=========COMPARATOR MANUAL=========");

        // bikin comparator manual, misal dengan Anonymous Class
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // ordered descending
            }
        };

        // create object map and input comparator
        SortedMap<String, String> sortedMap1 = new TreeMap<>(comparator);
        sortedMap1.put("faraday", "Faraday");
        sortedMap1.put("thomas", "Thomas");
        sortedMap1.put("albert", "Albert");
        sortedMap1.put("tesla", "Tesla");
        sortedMap1.put("galileo", "Galileo");
        sortedMap1.put("gosling", "Gosling");

        for (var key : sortedMap1.keySet()) {
            System.out.println("Key : " + key);
        }

        // bikin SortedMap yang IMMUTABLE
        SortedMap<String, String> empty = Collections.emptySortedMap();

        // ubah sorted map immutable menjadi immutable
        SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(sortedMap1);
    }
}
