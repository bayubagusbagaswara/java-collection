# Vector Class

- Vector class adalah implementasi dari interface List 
- Cara kerjanya mirip dengan ArrayList 
- Perbedaannya adalah semua method di Vector menggunakan kata kunci `synchronized`, artinya dia `thread safe` (aman saat melakukan multi thread)
- Jadi kalau ada 2 proses mengakses Vector atau Object yang sama, maka dia aman
- PROBLEM : karena semua menggunakan kata kunci synchronized maka berpengaruh ke performance yang menjadi lambat dibandingkan ArrayList
- Terus bagaimana kita membuat List yang bisa paralel dan aman? 
- Di versi Java baru, sudah disediakan yang lebih canggih untuk itu
- Oleh karena itu penggunaan Vector sudah jarang sekali ditemui sekaran