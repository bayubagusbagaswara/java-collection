# Identity Hash Map Class

- IdentityHashMap juga implementasi dari Map Interface, dan hampir sama dengan HashMap
- Perbedaannya adalah cara pengecekan `kesamaan datanya` tidak menggunakan function equals 
- Melainkan menggunakan `operator == (reference equality)`
- Artinya data dianggap sama, jika `lokasi di memori tersebut sama`
- Data Key dianggap sama, jika lokasi memorinya sama (atau bisa dibilang nama Key sama)
- Jika Key berbeda, meskipun isinya sama, dia akan dianggap berbeda
- Kalau Equals, benar-benar dibandingkan isinya