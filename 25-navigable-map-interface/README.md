# Navigable Map Interface

- NavigableMap merupakan interface turunan dari SortedMap interface
- Implementasi class concrete nya adalah TreeMap 
- Jadi apapun yang dilakukan di SortedMap, bisa juga dilakukan di NavigableMap 
- Sehingga otomatis KEY nya juga akan di Sorting (terurut)
- Memiliki kemampuan NAVIGASI berdasarkan operasi matematika 
- Seperti: kurang dari `<=` , lebih dari `>=`, dan lain-lain 
- Kegunaannya adalah kita bisa mengambil data Key dengan `navigasi`
- Contoh : kita ingin mengambil data yang
  - x >= key y (nilai x lebih dari atau sama dengan nilai key y)
  - x <= key y
- Penyelesaian case diatas sangat cocok menggunakan NavigableMap