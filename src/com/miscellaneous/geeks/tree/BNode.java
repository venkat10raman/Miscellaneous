package com.miscellaneous.geeks.tree;

public class BNode {
	
	private BNode left;
	private BNode right;
	private Integer data;
	
	public BNode(Integer data) {
		this.data = data;
	}

	public BNode getLeft() {
		return left;
	}

	public BNode getRight() {
		return right;
	}

	public Integer getData() {
		return data;
	}

	public void setLeft(BNode left) {
		this.left = left;
	}

	public void setRight(BNode right) {
		this.right = right;
	}

	public void setData(Integer data) {
		this.data = data;
	}

}
