package com.miscellaneous.geeks.linkedList.groupb.doublee;

public class DNode {
	
	private int data;
	private DNode previous;
	private DNode next;
	
	public DNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public DNode getPrevious() {
		return previous;
	}

	public DNode getNext() {
		return next;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setPrevious(DNode previous) {
		this.previous = previous;
	}

	public void setNext(DNode next) {
		this.next = next;
	}
	
}
