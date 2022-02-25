package com.collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {

        // create object map menggunakan implementasi TreeMap
        NavigableMap<String, String> map = new TreeMap<>();

        // add data
        map.put("albert", "Albert");
        map.put("tesla", "Tesla");
        map.put("gosling", "Gosling");
        map.put("faraday", "Faraday");

        for (var key : map.keySet()) {
            System.out.println("Key : " + key);
        }

        // get data by navigation
        // key yang nilainya kurang dari "gosling"
        System.out.println(map.lowerKey("gosling")); // key faraday

        // key yang nilainya lebih dari "gosling"
        System.out.println(map.higherKey("gosling")); // key tesla

        // key yang nilainya kurang dari atau sama dengan "gosling"
        System.out.println(map.ceilingKey("gosling")); // key gosling

        // key yang nilainya lebih dari atau sama dengan "gosling"
        System.out.println(map.floorKey("gosling")); // key gosling

        // ceilingKey dan floorKey pasti mencari key yang sama dan yang paling terdekat
        // karena kita punya data "gosling", pasti hasilna juga "gosling"

        // Untuk operasi kurang dari atau lebih dari hanya TEPAT 1 KEY yang dihasilkan, tidak semua key ditampilkan

        System.out.println("==============IMMUTABLE================");
        NavigableMap<String, String> empty = Collections.emptyNavigableMap();

        // konversi dari mutable ke immutable
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(map);

        // setelah diubah ke Immutable maka tidak bisa diubah-ubah lagi datanya
        for (var value : immutable.keySet()) {
            System.out.println("Key : " + value);
        }
    }
}
