package com.collection;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorApp {
    public static void main(String[] args) {

        // create object list
        // sebenarnya spliterator mirip iterator
        // split artinya itu dipotong list nya, jadi dipecah-pecah agar memudahkan pemrosesan datanya
        // jadi sebenarnya tidak dibuang datanya
        List<String> names = List.of("Tesla", "Gosling", "Albert", "Hawking", "Benjamin", "Faraday");

        // kita split list name menggunakan function spliterator()
        // secara default split ini akan dibagi menjadi 2
        // hasill nya 6 data dibagi 2, hasilnya 3 data split
        Spliterator<String> spliterator1 = names.spliterator();

        // dari spliterator1 yang sudah displit, kemudian kita coba split menggunakan trySplit()
        // jadi 3 dibagi 2, hasilnya 2
        Spliterator<String> spliterator2 = spliterator1.trySplit();

//         kemudian dari spliterator2 kita coba split lagi, jadi dari 2 data dibagi 2
        Spliterator<String> spliterator3 = spliterator2.trySplit();

        // jumlah data nya di split
        System.out.println("Size split-1 : " + spliterator1.estimateSize());
        System.out.println("Size split-2 : " + spliterator2.estimateSize());
        System.out.println("Size split-3 : " + spliterator3.estimateSize());

        // get all data menggunakan function forEach milik Default Method Collection
        System.out.println("SPLITERATOR 1");
        spliterator1.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String data) {
                System.out.println(data);
            }
        });
        System.out.println("SPLITERATOR 2");
        spliterator2.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String data) {
                System.out.println(data);
            }
        });
        System.out.println("SPLITERATOR 3");
        spliterator3.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String data) {
                System.out.println(data);
            }
        });

        // Jadi inti dari Spliterator ini adalah membagi pemrosesan data Collection
        // misal kita diawal punya 6 data: 1,2,3,4,5,6
        // Jika kita melakukan 1 kali Split, maka data akan tetap dari data sebelumnya
        // Jika kita melakukan 2 kali Split, maka data akan dibagi 2, jadi data 4,5,6 akan diproses dulu, kemudian data 1,2,3 akan diproses selanjutnya
        // Jika kita melakukan 3 kali Split, maka data pertama yang diproses adalah 4,5,6. Lalu data 2,3, kemudian data 1 paling akhir diprosesnya
    }
}
