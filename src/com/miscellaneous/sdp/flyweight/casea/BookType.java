package com.miscellaneous.sdp.flyweight.casea;

public class BookType {

	private final String type;
	private final String distributer;
	private final String otherData;
	
	public BookType(String type, String distributer, String otherData) {
		super();
		this.type = type;
		this.distributer = distributer;
		this.otherData = otherData;
	}

	public String getType() {
		return type;
	}

	public String getDistributer() {
		return distributer;
	}

	public String getOtherData() {
		return otherData;
	}
	
}
