package com.miscellaneous.serialization.casea;

public class ChildA extends ParentA {

	private static final long serialVersionUID = -471967323587454869L;
	
	private int childId;
	
	public ChildA(int parentId, int childId) {
		super(parentId);
		this.childId = childId;
	}

	public int getChildId() {
		return childId;
	}

	public void setChildId(int childId) {
		this.childId = childId;
	}
	
}
