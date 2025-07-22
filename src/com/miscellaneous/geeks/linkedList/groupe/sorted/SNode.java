package com.miscellaneous.geeks.linkedList.groupe.sorted;

public class SNode {

	private SNode next;
	private int data;
	private SNode random;
	
	public SNode(int data) {
		this.data = data;
	}

	public SNode getNext() {
		return next;
	}

	public int getData() {
		return data;
	}

	public SNode getRandom() {
		return random;
	}

	public void setNext(SNode next) {
		this.next = next;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setRandom(SNode random) {
		this.random = random;
	}
	
}
