package org.wecancodeit.Bands;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Album {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String albumName;
	private String songName;
	
	@ManyToOne
	private Band band;
	
	@OneToMany(mappedBy = "album")
	private Set<Song> music;
	
	public Set<Song> getMusic() {
		return music;
	}
	
	public Band getBand() {
		return band;
	}

	public Long getId() {
		return id;
	}

	public String getAlbumName() {
		return albumName;
	}

	public String getSongName() {
		return songName;
	}
	
	private Album() {
		
	}
	
	public void setBand(Band band) {
		this.band = band;
	}

	public Album(Band band, String albumName, String songName) {
		this.albumName = albumName;
		this.songName = songName;
	}
	
	

}
