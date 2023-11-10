package com.miscellaneous.serialization.casea;

import java.io.Serializable;

public class ParentA implements Serializable {

	private static final long serialVersionUID = -2447497313817249399L;
	
	private int parentId;
	
	public ParentA(int parentId) {
		this.parentId = parentId;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	
}
