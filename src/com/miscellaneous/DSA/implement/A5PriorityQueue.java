package com.miscellaneous.DSA.implement;

import java.util.ArrayList;
import java.util.Collections;

public class A5PriorityQueue {

	private ArrayList<Integer> heap;

	public A5PriorityQueue() {
		heap = new ArrayList<>();
	}

	private void swap(int i, int j) {
		Collections.swap(heap, i, j);
	}

	public void offer(int item) {
		heap.add(item);
		heapifyUp(heap.size() - 1);
	}

	public int poll() {
		if (heap.isEmpty()) return -1;
		if(heap.size() ==1) return heap.remove(0);
		int root = heap.get(0);
		heap.set(0, heap.remove(heap.size() - 1));
		heapifyDown(0);
		return root;
	}

	public int peek() {
		return heap.isEmpty() ? -1 : heap.get(0);
	}

	public boolean isEmpty() {
		return heap.isEmpty();
	}

	private void heapifyUp(int index) {
		while (index > 0) {
			int parent = (index - 1) / 2;
			if (heap.get(index) <= heap.get(parent)) {
				break;
			}
			swap(index, parent);
			index = parent;
		}
	}

	private void heapifyDown(int index) {
		int leftChild, rightChild, largest;
		while (index < heap.size() / 2) {
			leftChild = 2 * index + 1;
			rightChild = 2 * index + 2;
			largest = index;

			if (leftChild < heap.size() && heap.get(leftChild) > heap.get(largest)) {
				largest = leftChild;
			}

			if (rightChild < heap.size() && heap.get(rightChild) > heap.get(largest)) {
				largest = rightChild;
			}

			if (largest == index) {
				break;
			}

			swap(index, largest);
			index = largest;
		}
	}

	public static void main(String[] args) {
		A5PriorityQueue pq = new A5PriorityQueue();
        pq.offer(10);
        pq.offer(20);
        pq.offer(15);
        pq.offer(5);
        pq.offer(30);
        
        System.out.println("Priority Queue Elements (Max Heap):");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
	}

}
