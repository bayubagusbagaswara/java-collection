# WeakHashMap Class

- WeakHashMap mirip dengan HashMap
- Perbedaannya adalah WeakHashMap menggunakan `Weak Key`
- Artinya adalah apabila data tidak digunakan lagi, maka secara otomatis data di WeakHashMap akan dihapus 
- Jika Key nya di delete, maka Valuenya juga ikut di delete 
- Jika terjadi `Garbage Collection` (maintenance memori secara otomatis), kemungkinan data di WeakHashMap akan dihapus 
- Untuk data mana yang dihapus kita tidak bisa mastikan, karena itu urusan Garbage 
- Cocok digunakan untuk menyimpan data `Cache` di memory yang hanya sementara