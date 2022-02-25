package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreateImmutableListApp {
    public static void main(String[] args) {

        // create List Immutable yang berisi 1 data
        List<String> one = Collections.singletonList("Adit");

        // create List Immutable yang isinya kosong
        List<String> empty = Collections.emptyList();

        // mengubah dari List Mutable menjadi Immutable
        // create mutable list
        List<String> mutable = new ArrayList<>();
        mutable.add("Bayu");
        mutable.add("Bagus");

        // convert mutable to immutable
        List<String> immutable = Collections.unmodifiableList(mutable);

        // membuat list yang fix, artinya kapasitas nya tidak bisa diubah
        List<String> elements = List.of("Albert", "Newton", "Faraday");
    }
}
