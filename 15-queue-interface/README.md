# Queue Interface

- Queue adalah implementasi dari struktur data `Antrian` atau `FIFO (First In First Out)`
- Artinya data yang pertama kali masuk, maka data tersebut yang pertama kali keluar
- Method yang ada di Queue interface:
  - offer()
  - remove()
  - poll()
  - element()
  - peek()

# Implementasi Queue Interface

1. Iterable -> Collection -> Queue Interface
2. Queue -> class concrete PriorityQueue
3. Queue -> Deque interface
4. Deque interface memiliki 2 class concrete, yakni `LinkedList` dan `ArrayDeque`

# ArrayDeque vs LinkedList vs PriorityQueue

- `ArrayDeque` menggunakan `array` sebagai implementasi queue (antriannya) nya
- `LinkedList` menggunakan `double linked list` sebagai implementasi queue nya. Tapi ingat, double linked list akan `lambat` dalam pengambilan data
- `PriorityQueue` menggunakan `array` sebagai implementasi queue nya. Namun `diurutkan` menggunakan Comparable atau Comparator