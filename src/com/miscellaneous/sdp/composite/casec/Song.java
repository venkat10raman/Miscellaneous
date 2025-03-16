package com.miscellaneous.sdp.composite.casec;

public class Song extends SongComponent {

	private String songName;
	private String bandName;
	private int releaseYear;
	
	public Song(String newSongName, String newBandName, int newReleaseYear){
		this.songName = newSongName;
		this.bandName = newBandName;
		this.releaseYear = newReleaseYear;
	}
	
	public String getSongName() { return this.songName; }
	public String getBandName() { return this.bandName; }
	public int getReleaseYear() { return this.releaseYear; }
	
	public void displaySongInfo(){
		
		System.out.println(getSongName() + " was recorded by " +
				getBandName() + " in " + getReleaseYear());
		
	}
}
