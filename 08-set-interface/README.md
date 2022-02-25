# Set Interface

- Set Interface adalah salah satu collection yang berisikan elemen-elemen yang unik, atau tidak boleh `duplicate` (kembar)
- Set `tidak memiliki index` seperti di List, oleh karena itu tidak ada jaminan data yang ada di Set itu akan terurut sesuai dengan waktu kita memasukkan data ke Set
- Set tidak memiliki method baru. Jadi hanya menggunakan method yang ada di interface parent nya, yaitu Collection dan Iterable 
- Karena tidak memiliki index, untuk mengambil data di Set juga kita harus melakukan iterasi satu per satu 
- Set memiliki implementasi class konkrit nya yakni `HashSet` dan `LinkedHashSet`, ada juga `EnumSet` yakni set khusus untuk data Enum 
- Jadi kalau enum untuk memastikan datanya unik itu bisa menggunakan EnumSet, dan jarang dipakai

# HashSet vs LinkedHashSet

- Di belakang HashSet dan LinkedHashSet sebenarnya sama-sama ada `hash table`. Dimana data disimpan dalam sebuah hash table dengan `mengkalkulasi hashCode() function`
- Yang membedakan adalah `HashSet tidak menjamin data terurut` sesuai dengan waktu kita menambahkan data, sedangkan LinkedHashSet menjadim data terurut sesuai dengan waktu kita menambahkan data
- Urutan data di LinkedHashSet bisa dijaga karena di belakangnya menggunakan `double linked list` yakni menggunakan node