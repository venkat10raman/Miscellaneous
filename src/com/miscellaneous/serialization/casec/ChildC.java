package com.miscellaneous.serialization.casec;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ChildC extends ParentC {

	private static final long serialVersionUID = -471967323587454869L;
	
	private int childId;
	
	public ChildC(int parentId, int childId) {
		super(parentId);
		this.childId = childId;
	}
	
	// By implementing writeObject method,  
    // we can prevent  
    // subclass from serialization  
    private void writeObject(ObjectOutputStream out) throws IOException {  
        System.out.println("Hi Venkat from write object");
//    	throw new NotSerializableException();  
    }  
      
    // By implementing readObject method,  
    // we can prevent  
    // subclass from de-serialization  
    private void readObject(ObjectInputStream in) throws IOException {  
    	System.out.println("Hi Venkat from read object");
//    	throw new NotSerializableException();  
    } 

	public int getChildId() {
		return childId;
	}

	public void setChildId(int childId) {
		this.childId = childId;
	}
	
}
