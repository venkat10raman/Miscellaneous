package com.miscellaneous.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Serialization {

	public void perform(Object object, String filename) {
		try {
			ObjectOutput out = new ObjectOutputStream(
			new FileOutputStream(filename));
	
			out.writeObject(object);
			out.close();
			System.out.println("Serialization is done");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
