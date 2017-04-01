package com.org.hackaton.model;

import java.util.Date;

public class Tranaction {
	
	private Date tranactionDate;
	private int customerId;
	private float transAmount;
	private String transType;
	public Tranaction()
	{
		
	}
	public Tranaction(Date tranactionDate, int customerId, float transAmount,
			String transType) {
		super();
		this.tranactionDate = tranactionDate;
		this.customerId = customerId;
		this.transAmount = transAmount;
		this.transType = transType;
	}
	public Date getTranactionDate() {
		return tranactionDate;
	}
	public void setTranactionDate(Date tranactionDate) {
		this.tranactionDate = tranactionDate;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public float getTransAmount() {
		return transAmount;
	}
	public void setTransAmount(float transAmount) {
		this.transAmount = transAmount;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	
	
	

}
