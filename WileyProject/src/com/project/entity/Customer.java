package com.project.entity;

public class Customer {
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", phonenumber=" + phonenumber
				+ ", metrocardId=" + metrocardId + "]";
	}
	private int customerId;
	private String name;
	private String phonenumber;
	private int metrocardId;
	public Customer(int customerId, String name, String phonenumber, int metrocardId) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.phonenumber = phonenumber;
		this.metrocardId = metrocardId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public String getName() {
		return name;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public int getMetrocardId() {
		return metrocardId;
	}

}

