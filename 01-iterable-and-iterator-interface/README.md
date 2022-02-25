# Iterable Interface

- Iterable adalah `parent` untuk semua collection di Java, kecuali Map
- Iterable sendiri sangat sederhana, hanya digunakan untuk mendukung `for-each loop`
- Dikarenakan semua collection itu pasti implement iterable, maka secara otomatis semua collection di Java mendukung perulangan for-each
- Jadi yang bisa menggunakan for-each bukan hanya Array, tapi Collection juga bisa

# Iterator Interface

- Tidak ada yang magic di Java, sebenarnya for-each di Iterable bisa terjadi karena ada method `iterator()` yang mengembalikan object Iterator
- Iterator adalah `interface` yang mendefinisikan cara kita melakukan `pengaksesan element di collection secara sequential`
- For-each sendiri muncul sejak Java versi 5
- Sebelum Java 5 untuk melakukan iterasi sebuah collection, biasanya dilakukan secara manual dengan menggunakan `Iterator object`