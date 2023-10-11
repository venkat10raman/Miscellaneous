package com.miscellaneous.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class DeSerialization {

	public Object perform(String filename) {
		Object object = null;
		try {
			ObjectInput in = new ObjectInputStream(
			new FileInputStream("file.text"));
			object = in.readObject();
			in.close();
			System.out.println("DeSerialization is done");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return object;
	}

}
