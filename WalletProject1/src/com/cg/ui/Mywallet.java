package com.cg.ui;
import com.cg.bean.*;

public class Mywallet {

	public static void main(String[] args) {
		
		Account ob1 = new Account(100, "9997989594", "name here", 10000.00);
		
		double newbal = ob1.withdraw(2000);
		System.out.println(ob1);
		
		SavingAccount ob2 = new SavingAccount(101, "9998969597", "another name", 25000);
		ob2.setInterest();
		double newbal2 = ob2.withdraw(24000);
		System.out.println(ob2);

	}

}
