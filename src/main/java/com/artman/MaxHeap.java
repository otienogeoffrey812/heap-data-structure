package com.artman;

public class MaxHeap {
    public static void heapify(int[] array){
        int lastParentIndex = (array.length / 2) - 1;
        for (int i = lastParentIndex; i >=0; i--) {
            heapify(array, i);
        }
    }
    private static void heapify(int[] array, int index) {
        int largerIndex = index;
        int leftChildIndex = (index * 2) + 1;
        int rightChildIndex = (index * 2) + 2;

        if(leftChildIndex < array.length &&
                array[leftChildIndex] > array[largerIndex])
            largerIndex = leftChildIndex;

        if(rightChildIndex < array.length &&
                array[rightChildIndex] > array[largerIndex])
            largerIndex = rightChildIndex;

        if (index == largerIndex) return;

        swap(array, index, largerIndex);

        heapify(array, largerIndex);
    }
    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
