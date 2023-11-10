package com.miscellaneous.serialization;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DeSerialization {

	public static Object perform(String filename) {
		Object object = null;
		try {
			System.out.println("DeSerialization is Started");
			FileInputStream file = new FileInputStream(filename);
			ObjectInput in = new ObjectInputStream(file);
			object = in.readObject();
			in.close();
			file.close();
			System.out.println("DeSerialization is Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return object;
	}

}
