package com.collection;

import java.util.List;

public class MutableListApp {
    public static void main(String[] args) {

        // create object person
        Person person = new Person("Albert");

        // add data hobby to person
        person.addHobby("Football");
        person.addHobby("Swimming");

        // get all data hobby
        for (String hobby : person.getHobbies()) {
            System.out.println(hobby);
        }

        // Dari kode program diatas terlihat tidak ada problem

        System.out.println("=====================================");
        // kita coba panggil method dari luar dan kita tidak tahu isi (kode program) dalam method tersebut
        // dan ternyata dia berhasil memanggil method, dan ternyata kode program didalam function tersebut bisa mengubah data list kita
        // akhirnya dari method luar tersebut, data list kita bisa berubah-ubah

        doSomethingWithHobbies(person.getHobbies());

        for (String hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    // method doSomethingWithHobbies
    public static void doSomethingWithHobbies(List<String> hobbies){
        hobbies.add("Eaaaa problem in here, data ini masuk ke list");
    }

    // PROBLEM
    // Masalahnya jika didalam method doSomethingWithHobbies tersebut, kita atau orang lain itu salah memanggilnya
    // misal ada perintah add ke data hobbies
    // akhirnya bisa mengubah data hobbies
    // dan itu sangat berbahaya
    // kita tidak ingin data hobbies bisa diubah dari sembarang tempat
}
