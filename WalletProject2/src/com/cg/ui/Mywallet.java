package com.cg.ui;
import com.cg.bean.*;

public class Mywallet {

	public static void main(String[] args) {
		
	
		Account ob1 = new SavingAccount(101, "9998969597", "another name", 25000);
		((SavingAccount) ob1).setInterest();
		ob1.withdraw(24500);
		System.out.println(ob1);
		
		SavingAccount ob2 = new SavingAccount(105, "9996939598", "a name again", 50000);
		printAcc(ob2);
	}
	
	public static void printAcc(Account a) {
		
		System.out.println(a);
	}

}
