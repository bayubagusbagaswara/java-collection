# List Interface

- List adalah struktur data collection yang memiliki sifat sebagai berikut:
  - Elemen di list `bisa duplikat`, artinya bisa memasukkan data yang sama di dalam List
  - Data list `berurut` sesuai dengan posisi kita memasukkan datanya
  - List `memiliki index`, sehingga kita bisa menggunakan nomor index untuk mendapatkan element di list
- Di Java ada beberapa implementasi List, dan kita bisa memilih sesuai dengan kebutuhan kita

# Catatan Tambahan

- List adalah turunan dari Collection, semua method di Collection bisa diterapkan di List 
- Tetapi List adalah sebuah Interface, jadi tidak bisa digunakan secara langsung, hanya bisa di implementasikan
- Data di list berurutan, sesuai dengan waktu saat datanya dimasukkan 
- List memiliki index, bisa digunakan untuk mengambil data didalamnya 
- Element di List bisa duplikat atau kembar 
- List ukurannya bisa Dynamic, bisa memperbesar sendiri sesuai datanya 
- Class yang mengimplementasikan kontrak interface List ada 2 yakni, `ArrayList` dan `LinkedList`
- Kedua class tersebut bisa digunakan untuk membuat instance object dari List
