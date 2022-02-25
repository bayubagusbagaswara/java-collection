package com.collection;

import java.util.Arrays;
import java.util.List;

public class InterfaceCollectionApp {
    public static void main(String[] args) {

        // create object list
        List<String> names = List.of("Albert", "Tesla", "Newton", "Faraday");

        // konversi dari collection List ke tipe data Object Array
        Object[] objects = names.toArray();

        // konversi ke Array dengan tipe parameter generic nya yang kita inginkan, misal kita ingin jadi String
        // di parameter method toArray(), kita bikin object Array of String kosong (String[]{})
        // hasilnya akan konversi list names ke array disimpan didalam object strings
        String[] strings = names.toArray(new String[]{});

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(strings));
    }
}
