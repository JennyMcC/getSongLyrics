package org.wecancodeit.Bands;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Song {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Lob
	private String lyrics;
	
	private String songName;
	
	@ManyToOne
	private Album album;
	
	public Album getAlbum() {
		return album;
	}

	public Long getId() {
		return id;
	}

	public String getLyrics() {
		return lyrics;
	}

	public String getSongName() {
		return songName;
	}
	
	private Song() {
		
	}
	
	public void setAlbum(Album album) {
		this.album = album;
	}

	public Song(Album album, String songName, String lyrics) {
		this.lyrics = lyrics;
		this.songName = songName;
	}
	
	

}
