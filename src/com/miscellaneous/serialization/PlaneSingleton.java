package com.miscellaneous.serialization;

import java.io.Serializable;

public class PlaneSingleton implements Serializable, Cloneable {
	
	private static final long serialVersionUID = -1997202526160633786L;
	
	private int id;
	private String name;
	
	private static PlaneSingleton instance = null;
	
	private PlaneSingleton() {}

	public static PlaneSingleton getInstance() {
		if(instance == null) {
			synchronized (PlaneSingleton.class) {
				if(instance == null) {
					instance = new PlaneSingleton();
				}
			}
		}
		return instance;
	}
	
	// By implementing readResolve method,  
    // we can prevent new object creation from de-serialization
	protected Object readResolve() {return instance;}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return instance;
	}

	@Override
	public String toString() {
		return "PlaneSingleton [id=" + id + ", name=" + name + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
