package com.bank.model;

public class Account {

	private String num;
	private String name;
	private double balance;
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [num=" + num + ", name=" + name + ", balance=" + balance + "]";
	}
	
	

}
