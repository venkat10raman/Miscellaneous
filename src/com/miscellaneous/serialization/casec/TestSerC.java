package com.miscellaneous.serialization.casec;

import com.miscellaneous.serialization.DeSerialization;
import com.miscellaneous.serialization.Serialization;

public class TestSerC {

	public static void main(String[] args) {
		ChildC child = new ChildC(10, 100);
		System.out.println("Parent Id : " + child.getParentId());
		System.out.println("Child Id : " + child.getChildId());
		
		Serialization.perform(child, "resources/childc.ser");
		
		ChildC deChild = (ChildC) DeSerialization.perform("resources/childc.ser");
		System.out.println("Parent Id : " + deChild.getParentId());
		System.out.println("Child Id : " + deChild.getChildId());
	}

}
