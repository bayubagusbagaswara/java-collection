package com.collection;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapApp {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new WeakHashMap<>();

        // misal kita memasukkan data 1 juta ke hashMap
        for (int i = 0; i < 1_000_000; i++) {
            map.put(i, i);
        }

        // trigger Garbage Collection
        System.gc();

        // Cek kapasitas data di map setelah di garbage
        System.out.println("Kapasitas map setelah di garbage : " + map.size());

        // Hasilnya data di hashMap tidak ada 1 juta, karena di maintenance oleh garbage collector
        // Inilah sifat dari WeakHashMap, karena data tidak pernah dipakah, maka akan di hapus oleh Garbage Collector
    }
}
