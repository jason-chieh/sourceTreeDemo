package com.example.demo.entity;

public class TaipeiBank {

	private String branch = "¬Y¬Y¤À¦æ";
	
	private String user = "¬Y¬Y¤H";
	
	private int balance =1000;

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int saving(int amount) {
		if(amount>0) {
			balance += amount;	
		}
		return balance;
	}
	public int expensing(int withdraw) {
		if(withdraw>0 && balance>=withdraw) {
			balance -= withdraw;
		}
		return balance;
	}


}
