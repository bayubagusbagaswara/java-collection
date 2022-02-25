# SortedMap Interface

- SortedMap adalah implementasi Map interface dengan data Key nya diurutkan
- Pengurutannya sesuai dengan Comparable Key 
- Jika tidak implement Comparable, maka bisa dibaut sendiri Comparator 
- Cocok untuk kasus yang posisi Key pada Map itu harus berurut
- Jadi yang diurutkan itu adalah data Key nya

# Implementasi SortedMap

- Map interface -> SortedMap interface -> TreeMap concrete class