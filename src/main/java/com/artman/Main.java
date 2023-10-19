package com.artman;

public class Main {
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.insert(50);
        heap.insert(45);
        heap.insert(39);
        heap.insert(46);
        heap.insert(70);
        heap.insert(60);
        heap.insert(100);
        System.out.println();

        heap.remove();
        heap.remove();

        System.out.println();
    }
}