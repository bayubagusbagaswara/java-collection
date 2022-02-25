package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class DefaultMethodMapApp {
    public static void main(String[] args) {

        // default method untuk Map sangat banyak sekali, misalnya forEach()
        Map<String, String> map = new HashMap<>();

        map.put("albert", "Albert");
        map.put("tesla", "Tesla");
        map.put("faraday", "Faraday");

        // untuk method foreach, memiliki parameter BiConsumer
        // BiConsumser artinya ada 2 tipe data sebagai consumernya, yakni Key dan Value nya
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + ":" + value);
            }
        });
    }
}
