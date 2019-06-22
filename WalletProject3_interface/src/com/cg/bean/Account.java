package com.cg.bean;

public  class Account {
	
	private int aid;
	private Long mobile;
	private String accountHolder;
	private double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int aid, Long mobile, String accountHolder, double balance) {
		super();
		this.aid = aid;
		this.mobile = mobile;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [aid=" + aid + ", mobile=" + mobile + ", accountHolder=" + accountHolder + ", balance="
				+ balance + "]";
	}
	
	//public abstract double withdraw(double amount);
}