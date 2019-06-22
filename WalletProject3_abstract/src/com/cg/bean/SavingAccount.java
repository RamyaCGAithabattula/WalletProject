package com.cg.bean;

public class SavingAccount extends Account {
	
	private double interest ;
	private final int MIN_BALANCE = 1000;
	
	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}
	public SavingAccount(int aid, String mobile, String accountHolder, double balance) {
		super(aid, mobile, accountHolder, balance);
		// TODO Auto-generated constructor stub
	}
	public double getInterest() {
		return interest;
	}
	
	@Override
	public String toString() {
		return super.toString() + "SavingAccount [interest=" + interest + "]";
	}
	
	public void setInterest() {
	this.interest = super.getBalance() * 0.04;
	}
	
	@Override
	public double withdraw(double amount) {
		// TODO Auto-generated method stub
		double newBalance = super.getBalance() - amount;
		if(newBalance < MIN_BALANCE) {
			newBalance = super.getBalance();
			System.out.println("Insufficient Balance");
		}
		super.setBalance(newBalance);
		return newBalance;
	}
	
	
	
}
