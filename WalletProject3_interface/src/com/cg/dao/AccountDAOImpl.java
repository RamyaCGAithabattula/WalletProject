package com.cg.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.bean.*;

public class AccountDAOImpl implements AccountDAO {
     static Map<Long,Account> accmap=new HashMap<Long,Account>();
	@Override
	public boolean addAccount(Account ob) {
		 accmap.put(ob.getMobile(),ob);
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean updateAccount(Account ob) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAccount(Account ob) {
		accmap.remove(ob.getMobile());
		// TODO Auto-generated method stub
		return true;
	}

	
	@Override
	public Account findAccount(Long mobileno) {
		// TODO Auto-generated method stub
		Account ob=accmap.get(mobileno);
		// TODO Auto-generated method stub
		return ob;
		
	}

	@Override
	public Map<Long, Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return accmap;
	}

	@Override
	public boolean transferMoney(Account from, Account to) {
		// TODO Auto-generated method stub
		return true;
	}

	
	

}
