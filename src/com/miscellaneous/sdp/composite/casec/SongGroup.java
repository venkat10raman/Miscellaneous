package com.miscellaneous.sdp.composite.casec;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SongGroup extends SongComponent {

	// Contains any Songs or SongGroups that are added
	// to this ArrayList

	private List<SongComponent> songComponents = new ArrayList<>();

	private String groupName;
	private String groupDescription;

	public SongGroup(String newGroupName, String newGroupDescription){
		this.groupName = newGroupName;
		this.groupDescription = newGroupDescription;
	}

	public String getGroupName() { return groupName; }
	public String getGroupDescription() { return groupDescription; }

	public void add(SongComponent newSongComponent) {
		this.songComponents.add(newSongComponent);
	}

	public void remove(SongComponent newSongComponent) {
		this.songComponents.remove(newSongComponent);
	}

	public SongComponent getComponent(int componentIndex) {
		return (SongComponent)songComponents.get(componentIndex);
	}

	public void displaySongInfo(){
		System.out.println(getGroupName() + " " +
				getGroupDescription() + "\n");

		// Cycles through and prints any Songs or SongGroups added
		// to this SongGroups ArrayList songComponents

		Iterator<SongComponent> songIterator = songComponents.iterator();
		while(songIterator.hasNext()) { 
			SongComponent songInfo = (SongComponent) songIterator.next();
			songInfo.displaySongInfo();
		}
	}
}
