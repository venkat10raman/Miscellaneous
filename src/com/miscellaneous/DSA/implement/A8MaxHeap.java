package com.miscellaneous.DSA.implement;

import java.util.Arrays;

public class A8MaxHeap {

	private int[] heap;
	private int capacity;
	private int size;

	public A8MaxHeap(int capacity) {
		this.capacity = capacity;
		this.heap = new int[capacity];
		this.size =0;
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
		int parent = (index-1)/2;
		while(index > 0 && heap[index] > heap[parent]) {
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
		heap[0] = heap[size-1];
		size--;
		heapifyDown(0);
		return result;
	}

	private void heapifyDown(int index) {
		int largest = index;
		int left = 2*index+1;
		int right = 2*index+2;

		if(left < size && heap[left] > heap[largest]) {
			largest = left;
		}
		if(right < size && heap[right] > heap[largest]) {
			largest = right;
		}
		if(index != largest) {
			swap(index, largest);
			heapifyDown(largest);
		}

	}

	public static void main(String[] args) {
		A8MaxHeap maxHeap = new A8MaxHeap(10);

		// Add elements
		System.out.println("Adding elements: 3, 5, 7, 10, 12");
		maxHeap.add(3);
		maxHeap.add(5);
		maxHeap.add(7);
		maxHeap.add(10);
		maxHeap.add(12);
		System.out.print("Heap after adds: ");
		maxHeap.printHeap();

		// Add 2
		System.out.println("\nAdding 2:");
		maxHeap.add(2);
		System.out.print("Heap after adding 2: ");
		maxHeap.printHeap();;

		// Remove min
		System.out.println("\nRemoving min:");
		int min = maxHeap.poll();
		System.out.println("Removed: " + min);
		System.out.print("Heap after remove: ");
		maxHeap.printHeap();
	}

	private void swap(int i, int j) {
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}

	public void printHeap() {
		System.out.println(Arrays.toString(Arrays.copyOf(heap, size)));
	}

}
