package com.org.hackaton.model;

public class Customer {

	private int customerId;
	private String CustomerName;
	private float Salary;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	public Customer()
	{
		
	}
	public Customer(int customerId, String customerName, float salary) {
		super();
		this.customerId = customerId;
		CustomerName = customerName;
		Salary = salary;
	}
	
	
}
