package com.miscellaneous.geeks.queue;

public class A0Queue {
	
	private int[] queue;
	private int front, rear, capacity;
	
	public A0Queue(int size) {
		this.capacity = size;
		queue = new int[size];
		front = 0;
		rear = -1;
	}

	public static void main(String[] args) {
		A0Queue q = new A0Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        System.out.println("Dequeued: " + q.dequeue());
        q.display();

        System.out.println("Front element: " + q.peek());
	}
	
	public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot insert " + item);
            return;
        }
        queue[++rear] = item;
        System.out.println(item + " enqueued.");
    }
	
	public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int item = queue[front++];
        return item;
    }
	
	public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No peek value.");
            return -1;
        }
        return queue[front];
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front > rear;
    }
    
    public boolean isFull() {
        return rear == capacity - 1;
    }

    // Display the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

}
