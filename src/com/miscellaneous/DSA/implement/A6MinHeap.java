package com.miscellaneous.DSA.implement;

import java.util.Arrays;

import com.miscellaneous.util.CommonUtil;

public class A6MinHeap {

	private int[] heap;
	private int size;
	private int capacity;

	public A6MinHeap(int capacity) {
		this.capacity = capacity;
		this.heap = new int[capacity];
        this.size = 0;
	}

	private void add(int value) {
		if(size >= capacity) {
			throw new IllegalStateException("Heap is full");
		}
		heap[size] = value;
		heapifyUp(size);
		size++;
	}

	private void heapifyUp(int index) {
		int parent = (index -1)/2;
		while(index > 0 && heap[index] < heap[parent]) {
			swap(index, parent);
			index = parent;
			parent = (index-1)/2;
		}
	}

	private int poll() {
		if(size == 0) {
			throw new IllegalStateException("Heap is empty");
		}
		int result = heap[0];
		heap[0] = heap[size - 1];
		size--;
		heapifyDown(0);
		return result;
	}


	private void heapifyDown(int index) {
		int smallest = index;
		int left = 2 * index + 1;
		int right = 2 * index + 2;

		if(left < size && heap[left] < heap[smallest]) {
			smallest = left;
		}

		if(right < size && heap[right] < heap[smallest]) {
			smallest = right;
		}

		if(smallest != index) {
			swap(index, smallest);
			heapifyDown(smallest);
		}
	}

	private void swap(int i, int j) {
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}
	
	public void printHeap() {
        System.out.println(Arrays.toString(Arrays.copyOf(heap, size)));
    }

	public static void main(String[] args) {
		A6MinHeap minHeap = new A6MinHeap(10);

		// Add elements
		System.out.println("Adding elements: 3, 5, 7, 10, 12");
		minHeap.add(3);
		minHeap.add(5);
		minHeap.add(7);
		minHeap.add(10);
		minHeap.add(12);
		System.out.print("Heap after adds: ");
		minHeap.printHeap();
		
		// Add 2
        System.out.println("\nAdding 2:");
        minHeap.add(2);
        System.out.print("Heap after adding 2: ");
        minHeap.printHeap();
        
        // Remove min
        System.out.println("\nRemoving min:");
        int min = minHeap.poll();
        System.out.println("Removed: " + min);
        System.out.print("Heap after remove: ");
        minHeap.printHeap();
	}

}
