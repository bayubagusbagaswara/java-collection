package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClass {
    public static void main(String[] args) {

        // create object list
        List<String> names = new ArrayList<>(List.of(
                "Thomas Edison", "Tesla", "Albert",
                "Gosling", "Faraday"
        ));

        // get all data list
        System.out.println(names);

        // Reverse (dibalik), juga mengubah isi listnya
        // yang dibalik adalah urutan data yang masuk di list nya, bukan pengurutan ascending/descending
        // jadi data yang paling awal masuk, setelah direverse maka akan diletakkan paling akhir

        Collections.reverse(names);
        System.out.println(names);

        // Shuffle atau mengacak data di list
        Collections.shuffle(names);
        System.out.println(names);
    }
}
