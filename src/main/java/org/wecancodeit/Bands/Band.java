package org.wecancodeit.Bands;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Band {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private String imgURL;
	
	@OneToMany(mappedBy = "band")
	private Set<Album> tune;
	
	public Set<Album> getTune() {
		return tune;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String getImgURL() {
		return imgURL;
	}
	
	@SuppressWarnings("unused")
	private Band() {
		
	}

	public Band(String name, String imgURL) {
		this.name = name;
		this.imgURL = imgURL;
	}

}
