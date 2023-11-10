package com.miscellaneous.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void perform(Object object, String filename) {
		try {
			System.out.println("Serialization is Started");
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutput out = new ObjectOutputStream(file);
	
			out.writeObject(object);
			out.close();
			file.close();
			System.out.println("Serialization is Done");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
