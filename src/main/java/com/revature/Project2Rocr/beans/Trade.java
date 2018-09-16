package com.revature.Project2Rocr.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TRADE")
public class Trade {

	@Id
	@SequenceGenerator(name="GAME_ID_SEQ", sequenceName="GAME_ID_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GAME_ID_SEQ")
	@Column(name="TRADE_ID")
	private int tradeId;
	
	@Column(name="REQUESTED_OFFER_ID")
	private int requestedOfferId;
	
	@Column(name="GIVEN_OFFER_ID")
	private int givenOfferId;
	
	@Column(name="STATUS_ID")
	private int statusId;
	
	@ManyToOne(fetch=FetchType.EAGER, optional=false, cascade=CascadeType.ALL)
	@JoinColumn(name="REQUESTED_OFFER_ID", updatable=false, insertable=false)
	private Requests requestOffer;
	
	@ManyToOne(fetch=FetchType.EAGER, optional=false, cascade=CascadeType.ALL)
	@JoinColumn(name="GIVEN_OFFER_ID", updatable=false, insertable=false)
	private Requests givenOffer;
	
	@ManyToOne(fetch=FetchType.EAGER, optional=false, cascade=CascadeType.ALL)
	@JoinColumn(name="STATUS_ID", updatable=false, insertable=false)
	private Status status;
	
	public Trade() {}

	public Trade(int tradeId, int requestedOfferId, int givenOfferId) {
		super();
		this.tradeId = tradeId;
		this.requestedOfferId = requestedOfferId;
		this.givenOfferId = givenOfferId;
	}

	public int getTradeId() {
		return tradeId;
	}

	public void setTradeId(int tradeId) {
		this.tradeId = tradeId;
	}

	public int getRequestedOfferId() {
		return requestedOfferId;
	}

	public void setRequestedOfferId(int requestedOfferId) {
		this.requestedOfferId = requestedOfferId;
	}

	public int getGivenOfferId() {
		return givenOfferId;
	}

	public void setGivenOfferId(int givenOfferId) {
		this.givenOfferId = givenOfferId;
	}

	public Requests getRequestOffer() {
		return requestOffer;
	}

	public void setRequestOffer(Requests requestOffer) {
		this.requestOffer = requestOffer;
	}

	public Requests getGivenOffer() {
		return givenOffer;
	}
	
	public void setGivenOffer(Requests givenOffer) {
		this.givenOffer = givenOffer;
	}
	
	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Trade [tradeId=" + tradeId + ", requestedOfferId=" + requestedOfferId + ", givenOfferId=" + givenOfferId
				+ "]";
	}
	
	
}
