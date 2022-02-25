# Deque Interface

- Deque singkatan dari `double ended queue`, artinya adalah queue yang bisa beroperasi dari `depan atau belakang`
- Jika pada queue, operasi yang didukung hanya FIFO
- Sedangkan pada dequeu, mampu mendukung FIFO dan LIFO
- Bisa dibilang, deque ini adalah implementasi struktur data `antrian dan tumpukan (stack)`
- Contoh method yang dimiliki interface deque:
  - addFirst()
  - addLast()
  - offerFirst()
  - removeFirst()
  - removeLast()
  - pollFirst()
  - pollLast()
  - peekFirst()
  - peekLast()
  - dan lain-lain

# Implementasi Deque

- Iterable -> Collection -> Queue -> Deque interface 
- Deque interface memiliki 2 class concrete, yakni `LinkedList class` dan `ArrayDeque class`

