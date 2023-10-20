package com.artman;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Heap heap = new Heap();
//        heap.insert(50);
//        heap.insert(45);
//        heap.insert(39);
//        heap.insert(46);
//        heap.insert(70);
//        heap.insert(60);
//        heap.insert(100);
//        heap.remove();
//        heap.remove();

//        int[] arrays = {5, 3, 10, 1, 4, 2};
//        heap.heapSort(arrays);
//        System.out.println(Arrays.toString(arrays));
        PriorityQueue queue = new PriorityQueue();
        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(10);
        queue.enqueue(1);
        queue.enqueue(4);
        queue.enqueue(2);
        queue.dequeue();
    }
}