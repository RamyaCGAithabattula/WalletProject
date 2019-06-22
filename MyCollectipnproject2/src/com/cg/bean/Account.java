package com.cg.bean;

public class Account implements Comparable<Account> {
	
	private int aid;
	private long mobile;
	private String accountHolder;
	private double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int aid, long mobile, String accountHolder, double balance) {
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

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
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

	@Override
	public int compareTo(Account arg0) {
		//System.out.println()
		int diff=this.getAid()-arg0.getAid();
		
		if(diff>0)
			return 1;
		else if(diff<0)
			return -1;
		else
			return 0;
		
	}
	
	//public abstract double withdraw(double amount);
}