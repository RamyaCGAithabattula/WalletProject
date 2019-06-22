package com.cg.service;

import com.cg.bean.Account;
import com.cg.exception.InsufficientFundException;
public interface Transactions  extends AccountOperation{
	
	public double withdraw(Account a, double amount) throws InsufficientFundException;
	public double deposit(Account a, double amount);
	public double transfer(Account from, Account to, double amount);

	public default void printStatement(Account a) {
		
		System.out.println("===============================================");
		System.out.println();
		System.out.println("Statement for account number: "+ a.getAid());
		System.out.println("account holder: " + a.getAccountHolder());
		System.out.println("balance: " + a.getBalance());
		System.out.println();
		System.out.println("===============================================");
		System.out.println();

	
	}
	
	
}
