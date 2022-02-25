package com.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {

        System.out.println("=========== TUMPUKAN ATAU STACK =============");
        // create object tipe deque
        Deque<String> stack = new LinkedList<>();

        // menambah data ke tumpukan itu mirip dengan cara DESCENDING
        // jadi data yang pertama masuk disimpan dipaling bawah/belakang/akhir
        // pengambilan data bisa dilakukan dari 2 arah
        // bisa dari data paling atas atau data yang paling bawah
        // offerFirst() artinya menambahkan data di paling depan, sehingga data yang paling pertama akan bergeser atau dioffer oleh data baru diatasnya
        // offerFirst() menyebabkan datanya akan menjadi TUMPUKAN atau mirip urutan DESCENDING (data paling akhir masuk berada di paling atas)
        // offerLast() artinya seperti antrian biasa, data paling awal masuk akan berada di paling atas, dan diikuti data berikutnya

        stack.offerFirst("Albert");
        stack.offerFirst("Faraday");
        stack.offerFirst("Tesla");
        stack.offerFirst("Ohm");
        stack.offerFirst("Newton");
        stack.offerFirst("Thomas Edison");

        System.out.println("GET ALL DATA STACK");
        for (String name : stack) {
            System.out.println(name);
        }

        // INGAT! Mengambil data juga akan menghilangkan atau menghapus data tersebut dari stack
        // Data yang dimasukkan paling belakang (akhir) adalah data yang akan diambil pertama kali, karena bersifat tumpukan
        // pollLast() untuk mengambil data yang paling bawah/akhir/belakang (data yang paling awal dimasukkan ke stack)
        // pollFirst() untuk mengambil data paling atas/awal/depan (data yang paling akhir dimasukkan ke stack)

        System.out.println("Last Data: " + stack.pollLast()); // Albert data paling bawah, sesudah diambil lalu dihapus dari stack
        System.out.println("Last Data: " + stack.pollLast()); // Faraday paling bawah, karena data Albert sudah terhapus dari stack
        System.out.println("Last Data: " + stack.pollLast()); // Tesla paling bawah, karena data Faraday sudah terhapus dari stack

        System.out.println("First Data:  " + stack.pollFirst()); // Thomas Edison data paling atas, sesudah diambil lalu dihapus dari stack
        System.out.println("First Data: " + stack.pollFirst()); // Newton paling atas, karena data Thomas Edison sudah terhapus dari stack
        System.out.println("First Data: " + stack.pollFirst()); // Ohm paling atas, karena data Newton sudah terhapus dari stack

        // Size untuk mengecek kapasitas di tumpukan yang tersisa setelah datanya diambil
        System.out.println("Size tumpukan saat ini : " + stack.size()); // 0, karena sudah diambil 6 datanya

        System.out.println("GET ALL CURRENT STACK DATA");
        for (String name : stack) {
            System.out.println(name);
        }

        System.out.println("=========== ANTRIAN ============");
        // ibarat antrian orang, jika sudah selesai antri, maka orang tersebut akan keluar dari antrian

        // create object
        Deque<String> fruits = new LinkedList<>();

        // Menambah data ke antrian, menggunakan offerLast()
        // offerLast() yaitu data yang masuknya paling awal, maka data tersebut akan berada di antrian paling depan/atas/awal

        fruits.offerLast("Apple");
        fruits.offerLast("Orange");
        fruits.offerLast("Mango");
        fruits.offerLast("Avocado");
        fruits.offerLast("Pineapple");

        // data yang pertama masuk antrian akan diambil terlebih dulu, kemudian akan dihapus dari antrian
        // mirip antrian loket
        System.out.println("First data: " + fruits.pollFirst()); // Apple
        System.out.println("First data: " + fruits.pollFirst()); // Orange
        System.out.println("First data: " + fruits.pollFirst()); // Mango
        System.out.println("First data: " + fruits.pollFirst()); // Avocado
        System.out.println("First data: " + fruits.pollFirst()); // Pineapple
        System.out.println("First data: " + fruits.pollFirst()); // null, karena antrian sudah kosong

        System.out.println("Size antrian saat ini : " + fruits.size());

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // PERBEDAAN TUMPUKAN DAN ANTRIAN ADALAH FUNCTION DALAM MENGAMBIL DATA DATANYA,
        // TAPI HASILNYA TETAP SAMA
        // Jika Tumpukan menggunakan pollLast()
        // Jika Antrian menggunakan pollFirst()
        // hasilnya sama tetap data yang pertama kali masuk, akan diambil dan dihapus dahulu
    }
}
