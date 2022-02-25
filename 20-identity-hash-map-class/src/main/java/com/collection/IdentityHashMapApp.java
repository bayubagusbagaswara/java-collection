package com.collection;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapApp {
    public static void main(String[] args) {

        // create object map menggunakan implementasi IdentityHashMap
        Map<String, String> map = new IdentityHashMap<>();

        String key1 = "name.first";

        String name = "name";
        String first = "first";

        String key2 = name + "." + first;

        // bandingkan antara string dari key1 dan string key2
        // jika menggunakan function equals(), maka hasilnya adalah sama, karena isinya memang sama
        System.out.println(key1.equals(key2));

        // jika menggunakan operator ==, hasilnya dianggap beda, karena memang berbeda lokasi memori
        System.out.println(key1 == key2);

        // tambahkan data ke Map, dengan data yang sama meskipun key nya beda
        map.put(key1, "Albert");
        map.put(key2, "Albert");

        // cek size di map nya
        System.out.println("Size : " + map.size()); // 2, karena key1 dan key2 dianggap berbeda (lokasi memory berbeda)
    }
}
