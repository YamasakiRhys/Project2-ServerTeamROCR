package com.revature.Project2Rocr.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="GENRE")
public class Genre implements Serializable{

	@Id
	@Column(name="GENRE_ID")
	private int genreId;
	
	@Column(name="GENRE_TYPE")
	private String genreType;
	
	@OneToMany(mappedBy="genre", fetch=FetchType.LAZY)
	private Set<Games> acc = new HashSet<Games>();
	
	public Genre() {}

	public Genre(int genreId, String genreType) {
		super();
		this.genreId = genreId;
		this.genreType = genreType;
	}

	public int getGenreId() {
		return genreId;
	}

	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}

	public String getGenreType() {
		return genreType;
	}

	public void setGenreType(String genreType) {
		this.genreType = genreType;
	}

	@Override
	public String toString() {
		return "Genre [genreId=" + genreId + ", genreType=" + genreType + "]";
	}
	
}
