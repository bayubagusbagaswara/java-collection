package com.collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {

        // remove, mengambil dan menghapus data, tapi jika sudah kosong, maka akan throw error
        // poll, mengambil dan menghapus data, tapi jika sudah kosong, hanya akan dikembalikan nilai null

        // create object dengan tipe data Queue<String> menggunakan implementasi ArrayDeque
        Queue<String> stringQueue = new ArrayDeque<>();

        // LinkedList menggunakan double linked list, yakni node
        // Queue<String> stringQueue = new LinkedList<>();

        // Priority akan mengurutkan data antriannya
        // Queue<String> stringQueue = new PriorityQueue<>();

        // misal kita tambahkan data sebanyak 10 data
        for (int i = 0; i < 10; i++) {
            stringQueue.add(String.valueOf(i));
        }

        // kita lakukan ambil data atau mengeluarkan data dari Antrian menggunakan poll()
        // jadi poll() ini akan mangambil data, lalu akan menghapusnya dari antrian
        // selama next masih ada datanya, maka poll lagi
        // karena menggunakan POLL, jika data setelahnya kosong, maka akan berhenti dan mengembalikan data null, dan berhenti mengambil data
        for (String next = stringQueue.poll(); next != null; next = stringQueue.poll()){
            System.out.println(next);
        }

        System.out.println("Size queue: " + stringQueue.size()); // hasilnya 0, karena data sudah diambil/dikeluarkan menggunakan poll diatas
    }
}
