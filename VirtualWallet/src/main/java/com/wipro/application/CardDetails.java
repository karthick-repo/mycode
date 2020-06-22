package com.wipro.application;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CardDetails implements Serializable{
	
	@Id
	@Column(name="USERID")
	private String userid;
	
	@Column(name="CARDNAME")
	private String cardname;
	
	@Column(name="amount")
	private int amount;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getCardname() {
		return cardname;
	}

	public void setCardname(String cardname) {
		this.cardname = cardname;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "CardDetails [userid=" + userid + ", cardname=" + cardname + ", amount=" + amount + "]";
	}
	
	
}
