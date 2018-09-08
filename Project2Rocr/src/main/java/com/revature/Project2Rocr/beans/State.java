package com.revature.Project2Rocr.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="STATES")
public class State implements Serializable {

	@Id
	@Column(name="STATE_ID")
	private int stateId;
	
	@Column(name="STATE_NAME")
	private String stateName;
	
	@OneToMany(mappedBy="state" ,fetch=FetchType.LAZY)
	private Set<Account> acc = new HashSet<Account>();

	public State() {}
	
	public State(int stateId, String stateName) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getState() {
		return stateName;
	}

	public void setState(String state) {
		this.stateName = state;
	}


	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", state=" + stateName + "]";
	}
	
}
