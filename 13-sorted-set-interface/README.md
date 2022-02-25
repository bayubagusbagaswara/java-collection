# SortedSet Interface

- SortedSet merupakan interface yang juga turunan dari interface Set 
- Jadi SortedSet juga merupakan `kontrak interface`
- Bedanya dengan Set yakni, SortedSet itu data atau elemen yang dimasukkan akan `otomatis terurut`
- Bedanya dengan LinkedHashSet apa kalau sama-sama diurutkan? 
- Jika di LinkedHashSet `pengurutan berdasarkan waktu` saat data ditambahkan 
- Sedangkan SortedSet benar-benar diurutkan misal `berdasarkan Ascending/Descending`
- Jika elemen atau datanya adalah turunan dari `Interface Comparable`, maka secara otomatis diurutkan menggunakan Comparable itu sendiri 
- Maksudnya jika object nya tersebut implement terhadap Comparable, kalau masukkannya String atau Integer itu sudah Comparable dan otomatis diurutkan 
- Tetapi jika element bukan turunan dari Comparable, maka kita harus menggunakan `Comparator`
- atau dalam arti lain kita wajib membuat Comparator sendiri 
- Tujuan Comparator adalah untuk memberi tahu SortedSet `bagaimana cara mengurutkan element-elementnya`
- Selain mewarisi interface Set, interface SortedSet sendiri juga memiliki method sendiri seperti `headSet()`, `tailSet()` dll

# Struktur Perwaisan SortedSet
- Set interface -> SortedSet interface -> NavigableSet interface -> TreeSet sebagai class konkrit 
- Jadi, untuk mengimplementasikan SortedSet kita bisa menggunakan class konkrit nya yang bernama `TreeSet`