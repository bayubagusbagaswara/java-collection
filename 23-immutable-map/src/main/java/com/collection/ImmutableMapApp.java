package com.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {

        // create map kosong immutable
        Map<String, String> empty = Collections.emptyMap();

        // create map singleton immutable
        Map<String, String> singleton = Collections.singletonMap("name", "Bayu");

        // create mutable map
        Map<String, String> mutable = new HashMap<>();
        mutable.put("1", "Apple");
        mutable.put("2", "Orange");
        mutable.put("3", "Mango");

        // convert from mutable map to immutable map
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        // create map from Array, karena Array itu ukurannya fix
        // atau membuat satu-satu data di map nya
        Map<String, String> map = Map.of(
                "1", "Pineapple",
                "2", "Starfruit",
                "3", "Watermelon"

        );

        // kalau kita coba menambah data ke map, maka akan error
        // map.put("4", "Pear");
    }
}
