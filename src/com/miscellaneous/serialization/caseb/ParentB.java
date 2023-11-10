package com.miscellaneous.serialization.caseb;

public class ParentB {

	private int parentId;
	
	public ParentB(int parentId) {
		this.parentId = parentId;
	}
	
	// default constructor 
    // this constructor must be present 
    // otherwise we will get runtime exception [InvalidClassException]
	public ParentB() {
		this.parentId = 50;
		System.out.println("ParentB class constructor called");
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	
}
