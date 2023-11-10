package com.miscellaneous.serialization.casea;

import com.miscellaneous.serialization.DeSerialization;
import com.miscellaneous.serialization.Serialization;

public class TestSerA {

	public static void main(String[] args) {
		ChildA child = new ChildA(10, 100);
		System.out.println("Parent Id : " + child.getParentId());
		System.out.println("Child Id : " + child.getChildId());
		
		Serialization.perform(child, "resources/childa.ser");
		
		ChildA deChild = (ChildA) DeSerialization.perform("resources/childa.ser");
		System.out.println("Parent Id : " + deChild.getParentId());
		System.out.println("Child Id : " + deChild.getChildId());
	}

}
