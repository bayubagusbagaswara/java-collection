# HashTable Class

- HashTable adalah class concrete implementasi dari interface Map 
- Ini mirip dengan HashMap
- Sama seperti Vector, semua method di HashTable memiliki kata kunci synchronized
- Jadi sangat lambat juga
- Saat ini sudah ada penggantinya yaitu `ConcurrentHashMap`
- sehingga HashTable sudah jarang sekali ditemui 
- Jika ingin membuat proses yang paralel, dan datanya menggunakan Map, lebih baik gunakan ConcurrentHashMap
