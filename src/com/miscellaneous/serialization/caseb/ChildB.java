package com.miscellaneous.serialization.caseb;

import java.io.Serializable;

public class ChildB extends ParentB implements Serializable {

	private static final long serialVersionUID = -471967323587454869L;
	
	private int childId;
	
	public ChildB(int parentId, int childId) {
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
