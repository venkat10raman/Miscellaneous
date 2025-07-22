package com.miscellaneous.geeks.stack;

public class StackNode {
	
	private StackNode next;
	private int data;
	
	public StackNode(int data) {
		super();
		this.data = data;
	}

	public StackNode getNext() {
		return next;
	}

	public int getData() {
		return data;
	}

	public void setNext(StackNode node) {
		this.next = node;
	}

	public void setData(int data) {
		this.data = data;
	}

}
