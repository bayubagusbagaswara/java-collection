package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApp {
    public static void main(String[] args) {

        // Sorting itu sebenarnya mengubah data
        // jadi harus bersifat Mutable, artinya bisa diubah struktur didalamnya

        // create object list
        List<String> list = new ArrayList<>();
        list.addAll(List.of(
                "Thomas Edison", "Tesla",
                "Albert", "Faraday",
                "Benjamin Franklyn", "Gosling"
        ));


        // cara mengurutkan nya dengan menggunakan function sort() milik Collections
        // Collections tidak akan membuat list baru, jadi yang diubah adalah list yang sudah kita buat

        Collections.sort(list);

        // get all data
        for (var value : list) {
            System.out.println(value);
        }

        System.out.println("=======Comparator Manual=======");
        // create comparator
        // misal kita ingin diurutkan secara descending
        Comparator<String> reverse = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        // sorting data di list, dan masukan comparatornya
        Collections.sort(list, reverse);

        // get all data
        for (var value : list) {
            System.out.println(value);
        }
    }
}
