package com.cg.service;

import java.util.Map;

import com.cg.bean.Account;
import com.cg.dao.AccountDAO;
import com.cg.dao.AccountDAOImpl;
import com.cg.exception.InsufficientFundException;
public class AccountService implements gst, Transactions {
	AccountDAO dao=new AccountDAOImpl();

	@Override
	public double withdraw(Account a, double amount)throws InsufficientFundException {
		double newBalance = a.getBalance() - amount;
		if(newBalance < 1000) {
			newBalance = a.getBalance();
			//System.out.println("Insufficient Balance");
			throw new InsufficientFundException("Insufficient Fund. Cannot process withdrawal",newBalance);
		}
		a.setBalance(newBalance);
		return newBalance;
	}

	@Override
	public double deposit(Account a, double amount) {
		
		a.setBalance(a.getBalance() + amount);
		return a.getBalance();
	}

	@Override
	public double transfer(Account from, Account to, double amount) {
		double newBalance=from.getBalance()-amount;
		if(newBalance<1000.00) {
			System.out.println("insuffcient balance");
			return 1;
		}
		from.setBalance(newBalance);
	    double b2=to.getBalance()+amount;
	    to.setBalance(b2);
	    String ans="from account" +from.getAid()+"balance" +from.getBalance()+"\n"+"to account" +to.getAid()+"balance";
		return 1;
	}

	@Override
	public double calculateTax(double percent, double amount) {
		
		return amount * gst.PERCENT_5;
	}
	public boolean addAccount(Account ob) {
		
		return dao.addAccount(ob);
	}
	public boolean deleteAccount(Account ob) {
		return dao.deleteAccount(ob);
		
	}
	
	public Map<Long,Account> getAllAccount() {
		return dao.getAllAccounts();
		
	}

	@Override
	public Account findaccount(Long mobileno) {
		// TODO Auto-generated method stub
		return dao.findAccount(mobileno);
	}

}
