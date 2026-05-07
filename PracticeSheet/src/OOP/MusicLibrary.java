package OOP;

import java.util.ArrayList;

class Song {
	String title;
	String artist;

	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	void displaySong() {
		System.out.println("Song : " + title + "\t | Artist : " + artist);
	}
}

public class MusicLibrary {
	ArrayList<Song> songs = new ArrayList<Song>();
	
	public void addSong(Song s) {
		songs.add(s);
		System.out.println("Song Added.");
	}
	
	public void removeSong(Song s) {
		songs.remove(s);
		System.out.println("Song Removed.");
	}
	
	
}
