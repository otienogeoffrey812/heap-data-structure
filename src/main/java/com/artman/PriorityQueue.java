package com.artman;

public class PriorityQueue {
    private final Heap heap = new Heap();
    public void enqueue(int item){
        heap.insert(item);
    }
    public int dequeue(){
       return heap.remove();
    }
    public boolean isEmpty(){
        return heap.isEmpty();
    }
}
