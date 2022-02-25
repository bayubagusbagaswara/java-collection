# Immutable List

- Secara default, List di Java baik itu ArrayList ataupun LinkedList datanya bersifat `mutable` (bisa diubah-ubah)
- Di Java itu mendukung pembuatan `Immutable List`, artinya datanya tidak bisa diubah lagi
- Sekali List dibuat, maka datanya tidak bisa diubah lagi, alias `final`
- Tapi ingat, data list nya yang tidak bisa diubah, bukan reference object element nya
- Kalau misal kita membuat Immutable List berisikan data Person, field dan Person tetap bisa diubah, tetapi isi element dari Immutable List tidak bisa diubah lagi
- Ini cocok ketika kasus-kasus misal, tidak sembarangan code yang boleh mengubah element di List