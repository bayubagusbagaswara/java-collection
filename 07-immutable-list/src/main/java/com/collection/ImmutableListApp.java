package com.collection;

import java.util.List;

public class ImmutableListApp {
    public static void main(String[] args) {

        // create object person
        Person person = new Person("Albert");
        person.addHobby("Football");
        person.addHobby("Swimming");
        person.addHobby("Cycling");

        // call method
        doSomethingWithHobbies(person.getHobbies());

        // get all data
        for (String hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies){
        // Jika kita paksa didalam method ini melakukan tambah data ke List, maka akan terjadi Error
        // sehingga disini sudah tidak bisa manipulasi data hobbies didalam List
        // karena method add() dan remove itu adalah milik Collection
        // jadi bisa kita gunakan di List, tapi kadang kita hanya ingin menambah data list melalui method yang kita buat sendiri

        // hobbies.remove(1);
        // hobbies.add("Eaaa problem disini, karena data ini bisa masuk ke list");
    }
}
