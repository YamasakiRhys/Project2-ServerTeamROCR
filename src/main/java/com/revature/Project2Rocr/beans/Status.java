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
	private Set<Requests> req = new HashSet<Requests>();
	
	public Status() {}

	public Status(int statusId, String statusName, Set<Requests> requests) {
		super();
		this.statusId = statusId;
		this.statusName = statusName;
		this.req = requests;
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

	public Set<Requests> getRequests() {
		return req;
	}

	public void setRequests(Set<Requests> requests) {
		this.req = requests;
	}

	@Override
	public String toString() {
		return "Status [statusId=" + statusId + ", statusName=" + statusName + ", requests=" + req + "]";
	}
	
}
