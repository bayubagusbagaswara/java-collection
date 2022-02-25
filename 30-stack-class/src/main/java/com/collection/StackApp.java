package com.collection;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {

        // create object stack
        Stack<String> stack = new Stack<>();

        // push for add data to stack
        stack.push("Albert");
        stack.push("Tesla");
        stack.push("Gosling");
        stack.push("Faraday");
        stack.push("Galileo");

        // data yang paling akhir dimasukkan ke tumpukkan, maka data tersebut letaknya adalah paling atas
        // sehingga harus diambil terlebih dahulu
        // untuk mengambil data dari stack, kita menggunakan pop()
        // pop() akan mengambil datanya mulai dari yang paling atas

        // get all data from stack
        for (var value = stack.pop(); value != null; value = stack.pop()){
            System.out.println(value);
            // pop saat dia kosong (datanya sudah tidak ada) dia akan exception, biasanya ini di try-catch
        }
    }
}
