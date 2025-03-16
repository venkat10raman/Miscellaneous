package com.miscellaneous.bdp.command.casea;

import java.util.ArrayList;
import java.util.List;

public class House {
	
	private List<Room> roomList;
	
	public House() {
		this.roomList = new ArrayList<>();
	}
	
	public void addRoom(Room room) {
		this.roomList.add(room);
	}

}
