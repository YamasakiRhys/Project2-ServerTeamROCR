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
@Table(name="STATUS")
public class Status implements Serializable{

	@Id
	@Column(name="STATUS_ID")
	private int statusId;
	
	@Column(name="STATUS_NAME")
	private String statusName;
	
	@OneToMany(mappedBy="status", fetch=FetchType.LAZY)
	private Set<Requests> requests = new HashSet<Requests>();
	
	public Status() {}

	public Status(int statusId, String statusName, Set<Requests> requests) {
		super();
		this.statusId = statusId;
		this.statusName = statusName;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	@Override
	public String toString() {
		return "Status [statusId=" + statusId + ", statusName=" + statusName + "]";
	}
	
}
