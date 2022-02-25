# Map Interface

- Map adalah struktur data collection yang berisikan `mapping` antara `Key dan Value`
- Dimana Key itu harus `unik`, tidak boleh duplikat antar key yang ada
- dan satu key hanya boleh mapping ke satu value 
- Kalau VALUENYA duplikat tidak masalah, atau bisa dihubungkan ke banyak KEY 
- Map sebenarnya mirip dengan Array, 
- Bedanya kalau di `Array Key` adalah `index (integer)`
- Sedangkan di Map, Key nya bebas, bisa ditentukan sesuai keinginan kita, karena `Generic Value`

# Implementasi Map Interface 

- Map merupakan Interface, jadi butuh class concrete untuk implementasinya 
- Map mempunyai turunan class konkrit yang totalnya ada 5 class
- Meliputi: `HashMap`, `WeakHashMap`, `IdentityHashMap`, `LinkedHashMap`, `EnumHashMap`
