# HashMap Class

- HashMap adalah salat satu class konkrit yang merupakan implementasi dari Map Interface
- HashMap melakukan `distribusi key` nya menggunakan `hashCode()` function
- Karena HashMap sangat bergantung dengan hashCode() function. Jadi pastikan kita harus membuat function hashCode seunik mungkin, karena jika terlalu banyak nilai hashCode() yang sama, maka pendistribusian key nya tidak akan optimal, sehingga proses get data di Map akan semakin lambat
- di HashMap pengecekan data duplikat dilakukan dengan menggunakan method equals nya 
- Saat membuat hashCode, pastikan hashCode tidak ada yang sama, makanya lebih baik pake generate dari IDE