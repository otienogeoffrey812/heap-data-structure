package com.artman;

public class Heap {
    private int[] items = new int[10];
    private int size;
    public void insert(int value){
        if (isFull()) throw new IllegalStateException();

        items[size++] = value;
        var index = size - 1;

        while (index > 0 && items[index] > items[parent(index)]){
            swap(index, parent(index));
            index = parent(index);
        }
    }
    public int remove(){
        if (isEmpty()) throw new IllegalStateException();

        var removedItem = items[0];

        items[0] = items[--size];
        var index = 0;

        while (index <= size && !isValidParent(index)){
            var largerChildIndex = largerChildIndex(index);
            swap(index, largerChildIndex);
            index = largerChildIndex;
        }
        return removedItem;
    }
    public  void heapSort(int[] numbers){
        for (var num: numbers){
            insert(num);
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            numbers[i] = remove();
        }
    }
    private boolean isValidParent(int index){
        if (!hasLeftChild(index)) return true;

        if (!hasRightChild(index))
            return items[index] >= leftChild(index);

        return  items[index] >= leftChild(index)
                && items[index] >= rightChild(index);
    }
    private int largerChildIndex(int index){
        if(!hasLeftChild(index)){
            return index;
        }
        if(!hasRightChild(index)){
            return leftChildIndex(index);
        }
        return leftChild(index) > rightChild(index)
                ? leftChildIndex(index) : rightChildIndex(index);
    }
    private boolean hasLeftChild(int index) {
        return leftChildIndex(index) <= size;
    }
    private boolean hasRightChild(int index) {
        return rightChildIndex(index) <= size;
    }
    private int leftChild(int index){
        return items[leftChildIndex(index)];
    }
    private int rightChild(int index){
        return items[rightChildIndex(index)];
    }
    private int leftChildIndex(int index){
        return index * 2 + 1;
    }
    private int rightChildIndex(int index){
        return index * 2 + 2;
    }
    public boolean isFull(){
        return size == items.length;
    }
    public boolean isEmpty(){
        return size == items.length;
    }
    private int parent(int index){
        return  (index - 1) / 2;
    }
    private void swap(int first, int second){
        var temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }
}
