package com.org.hackaton.model;

public class Range {

	private float salary;
	private float credit;
	private float debit;
	private float deposit;
	
	public Range(){
	}
	public Range(float salary, float credit, float debit, float deposit) {
		super();
		this.salary = salary;
		this.credit = credit;
		this.debit = debit;
		this.deposit = deposit;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getCredit() {
		return credit;
	}
	public void setCredit(float credit) {
		this.credit = credit;
	}
	public float getDebit() {
		return debit;
	}
	public void setDebit(float debit) {
		this.debit = debit;
	}
	public float getDeposit() {
		return deposit;
	}
	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}
	
	
}
