package com.revature.Project2Rocr.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REQUESTS")
public class Requests {

	@Id
	@Column(name="REQUEST_ID")
	private int requestId;
	
	@Column(name="USER_ID")
	private int userId;
	
	@Column(name="GAME_ID")
	private int gameId;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="STATUS_ID")
	private int statusId;

	public Requests() {}
	
	public Requests(int requestId, int userId, int gameId, String description, int statusId) {
		super();
		this.requestId = requestId;
		this.userId = userId;
		this.gameId = gameId;
		this.description = description;
		this.statusId = statusId;
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

	@Override
	public String toString() {
		return "Requests [requestId=" + requestId + ", userId=" + userId + ", gameId=" + gameId + ", description="
				+ description + ", statusId=" + statusId + "]";
	}
	
}
