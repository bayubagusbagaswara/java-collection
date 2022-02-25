package com.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {

        // create object map menggunakan class implementasi HashMap
        // masukkan juga tipe generic untuk Key dan Value nya, misal key nya String dan value nya String
        Map<String, String> map = new HashMap<>();

        // menambah data ke map menggunakan put() function
        // jika data yang diinputkan belum ada di map nya, maka put bertugas untuk INSERT data
        // ika data yang diinputkan sudah ada di mapnya, maka PUT bertugas untuk UPDATE data (data lama ditimpa data baru)

        map.put("name.first", "Albert");
        map.put("name.middle", "Faraday");
        map.put("name.last", "Newton");

        // get data menggunakan key nya
        System.out.println(map.get("name.first"));
        System.out.println(map.get("name.middle"));
        System.out.println(map.get("name.last"));
    }
}
