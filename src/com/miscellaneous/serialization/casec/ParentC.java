package com.miscellaneous.serialization.casec;

import java.io.Serializable;

public class ParentC implements Serializable {

	private static final long serialVersionUID = -2447497313817249399L;
	
	private int parentId;
	
	public ParentC(int parentId) {
		this.parentId = parentId;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	
}
