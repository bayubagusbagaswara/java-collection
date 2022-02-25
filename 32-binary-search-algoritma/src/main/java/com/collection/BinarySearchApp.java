package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchApp {
    public static void main(String[] args) {

        // create object list
        List<Integer> numbers = new ArrayList<>();

        // add 1000 data to list
        for (int i = 1; i <= 1000; i++) {
            numbers.add(i);
        }

        // Lakukan pencarian, tapi datanya sudah berurut,
        // misal ingin cari angka ke 333
        int index = Collections.binarySearch(numbers, 333);

        // karena return dari binarySearch sudah index, maka dimulai dari index ke-0
        System.out.println("Data 333 ada di Index ke- " + index);

        System.out.println("=======Comparator Manual=========");
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // buat jadi Descending
                // agar datanya terurut tapi kebalik
                return o2.compareTo(o1);
            }
        };

        int index2 = Collections.binarySearch(numbers, 500);
        int index3 = Collections.binarySearch(numbers, 499);

        System.out.println("Data 500 ada di index ke- " + index2);
        System.out.println("Data 499 ada di index ke- " + index3);
    }
}
