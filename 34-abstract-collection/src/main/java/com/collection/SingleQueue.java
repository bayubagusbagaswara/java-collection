package com.collection;

import java.util.AbstractQueue;
import java.util.Collections;
import java.util.Iterator;

/**
 * membuat collection queue manual
 * langsung extends aja ke Abstract Class Queue nya
 * jangan lupa Collection adalah generic
 * kita buat antrian, tapi hanya boleh 1 data antrian nya
 * daripada kita implement interface Queue nya, kita bisa langsung extends Abstract milik Queue nya
 * yakni AbstractQueue
 */
public class SingleQueue<E> extends AbstractQueue<E> {

    // field data untuk menampung data dari list
    private E data;

    @Override
    public Iterator<E> iterator() {
        // karena antrian yang kita bikin hanya menampung 1 data, jadi pakai singleton untuk iterasi
        return Collections.singleton(data).iterator();
    }

    @Override
    public int size() {
        // jika datanya null, maka kita kembalikan 0,
        // jika bukan null, maka kita kembalikan 1
        return data == null ? 0 : 1;
    }

    @Override
    public boolean offer(E e) {
        // offer itu seperti insert data atau tambah data
        // jika data null (tidak ada), maka set data dengan nilai e (nilai baru yang dimasukkan)
        // dan kembalikan true karena sudah berhasil di insert
        if (data == null){
            data = e;
            return true;
        }
        // jika data tidak null, artinya data tidak bisa ditambahkan ke list
        return false;
    }

    @Override
    // poll itu mengambil dan menghapus data
    public E poll() {
        // temporary untuk mengambil data
        E temp = data;
        // data isi null atau sudah kosong
        data = null;
        // kembalikan ke temp, data kosong
        return temp;
    }

    @Override
    // peek untuk mengambil data, tapi tidak menghapus data
    public E peek() {
        // jadi langsung kembalikan datanya
        return data;
    }
}
