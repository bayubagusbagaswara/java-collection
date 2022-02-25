package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class DefaultMethodCollectionApp {
    public static void main(String[] args) {

        // create object list
        List<Integer> numbers = new ArrayList<>();

        // add 100 data to list
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }
        // print list
        System.out.println(numbers);

        // replaceAll()
        // untuk mengganti semua data di list numbers
        numbers.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer data) {
                // akan berubah jadi 2 semua
                // return 2;
                // tiap data di numbers akan dikali 10
                return data * 10;
            }
        });
        // print list
        System.out.println(numbers);

        // untuk method foreach, akan diprint satu persatu
        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer data) {
                System.out.println(data);
            }
        });

        // removeIf()
        // ada predikat nya atau syarat kondisi data yang akan dihapus
        numbers.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer data) {
                //  data yang nilainya lebih dari 500 akan di remove
                return data > 500;
            }
        });
    }
}
