package com.collection;

import java.util.Queue;

public class AbstractCollectionNote {
    public static void main(String[] args) {

        // kita implementasikan Queue yang sudah kita buat sendiri, yakni SingleQueue
        // single queue artinya kita hanya bisa menambah data 1 saja
        // jika mengganti data, maka data lama harus dihapus dulu

        Queue<String> queue = new SingleQueue<>();

        // size 0, karena belum ada datanya
        System.out.println("Size queue : " + queue.size());

        // add data to queue
        // true, artinya datanya diterima dan dimasukkan ke dalam queue
        System.out.println(queue.offer("Albert"));

        // false, artinya datanya ditolak
        System.out.println(queue.offer("Faraday"));

        // false, artinya datanya ditolak
        System.out.println(queue.offer("Tesla"));

        // check size queue
        // size 1 artinya sudah ada data
        System.out.println("Size queue current : " + queue.size());

        // ambil data tapi tidak remove
        System.out.println(queue.peek());

        // ambil sekaligus remove
        System.out.println(queue.poll());

        // null, karena sudah kosong karena di pool sebelumnya
        System.out.println(queue.poll());

        // check size queue
        System.out.println("Size queue current : " + queue.size()); // 0
    }
}
