package com.revature.Project2Rocr.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="GAMES")
public class Games {

	@Id
	@SequenceGenerator(name="GAME_ID_SEQ", sequenceName="GAME_ID_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GAME_ID_SEQ")
	@Column(name="GAME_ID")
	private int gameId;
	
	@Column(name="PLOT")
	private String plot;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="GENRE_ID")
	private int genreId;
	
	@ManyToOne(fetch=FetchType.EAGER, optional=false, cascade=CascadeType.ALL)
	@JoinColumn(name="GENRE_ID", updatable=false, insertable=false)
	private Genre genre;
	
	@OneToMany(mappedBy="games", fetch=FetchType.LAZY)
	private Set<Requests> requests = new HashSet<Requests>();
	
	public Games() {}

	public Games(int gameId, String plot, String title, int genreId, Genre genre) {
		super();
		this.gameId = gameId;
		this.plot = plot;
		this.title = title;
		this.genreId = genreId;
		this.genre = genre;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getGenreId() {
		return genreId;
	}

	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Games [gameId=" + gameId + ", plot=" + plot + ", title=" + title + ", genreId=" + genreId + ", genre="
				+ genre + "]";
	}

}
