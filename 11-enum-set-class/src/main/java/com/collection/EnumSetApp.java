package com.collection;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetApp {
    public static void main(String[] args) {

        // cara bikin EnumSet tidak pakai new EnumSet(), karena tidak berbentuk class
        // misal ingin buat EnumSet dari enum Gender
        // jika pake allOf(), maka akam ambil semua data enumnya
        // tipe datanya EnumSet/Set dan tipe parameternya adalah nama Enum Classnya

        EnumSet<Gender> genders = EnumSet.allOf(Gender.class);
        Set<Gender> genders2 = EnumSet.allOf(Gender.class);

        // Kalau ingin satu-satu data Enum-nya
        // caranya menggunakan of()
        // karena untuk EnumSet agar dia bisa dipastikan data UNIK, maka dia pake EnumSet, makanya jarang dipakai
        EnumSet<Gender> genders1 = EnumSet.of(Gender.MALE, Gender.FEMALE);

        System.out.println("GET ALL DATA ENUM");
        for (var gender : genders) {
            System.out.println(gender);
        }

        // Sebenarnya bisa pake cara lain yang simple
        // langsung mendapatkan semua data Array of Gender

        System.out.println("GET ALL ENUM GENDER SIMPLE");
        Gender[] values = Gender.values();
        for (var value: values) {
            System.out.println(value);
        }
    }
}
