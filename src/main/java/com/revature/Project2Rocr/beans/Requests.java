package com.revature.Project2Rocr.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="REQUESTS")
public class Requests {

	@Id
	@Column(name="REQUEST_ID")
	private int requestId;
	
	@Column(name="USER_ID")
	private int userId;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch=FetchType.LAZY, optional = false, cascade=CascadeType.ALL)
	@JoinColumn(name="USER_ID", insertable=false, updatable=false)
	private Account account;
	
	@Column(name="GAME_ID")
	private int gameId;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch=FetchType.LAZY, optional = false, cascade=CascadeType.ALL)
	@JoinColumn(name="GAME_ID", insertable=false, updatable=false)
	private Games games;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="STATUS_ID")
	private int statusId;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch=FetchType.LAZY, optional = false, cascade=CascadeType.ALL)
	@JoinColumn(name="STATUS_ID", insertable=false, updatable=false)
	private Status status;

	public Requests() {}

	public Requests(int requestId, int userId, Account account, int gameId, Games games, String description,
			int statusId, Status status) {
		super();
		this.requestId = requestId;
		this.userId = userId;
		this.account = account;
		this.gameId = gameId;
		this.games = games;
		this.description = description;
		this.statusId = statusId;
		this.status = status;
	}
	
	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Games getGames() {
		return games;
	}

	public void setGames(Games games) {
		this.games = games;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Requests [requestId=" + requestId + ", userId=" + userId + ", gameId=" + gameId + ", description="
				+ description + ", statusId=" + statusId + "]";
	}
	
}
