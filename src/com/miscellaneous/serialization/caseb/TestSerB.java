package com.miscellaneous.serialization.caseb;

import com.miscellaneous.serialization.DeSerialization;
import com.miscellaneous.serialization.Serialization;

public class TestSerB {

	public static void main(String[] args) {
		ChildB child = new ChildB(10, 100);
		System.out.println("Parent Id : " + child.getParentId());
		System.out.println("Child Id : " + child.getChildId());
		
		Serialization.perform(child, "resources/childb.ser");
		
		ChildB deChild = (ChildB) DeSerialization.perform("resources/childb.ser");
		System.out.println("Parent Id : " + deChild.getParentId());
		System.out.println("Child Id : " + deChild.getChildId());
	}

}
