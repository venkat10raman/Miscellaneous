package com.miscellaneous.sdp.composite.casec;

public class DiscJockey {

	private SongComponent songList;

	// newSongList contains every Song, SongGroup,
	// and any Songs saved in SongGroups
	public DiscJockey(SongComponent newSongList){
		this.songList = newSongList;
	}

	// Calls the displaySongInfo() on every Song
	// or SongGroup stored in songList
	public void getSongList(){
		songList.displaySongInfo();
	}

}
