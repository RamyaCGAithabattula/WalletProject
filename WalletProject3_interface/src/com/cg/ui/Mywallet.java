package com.cg.ui;
import java.util.*;
import java.io.*;
import com.cg.service.*;
import com.cg.bean.*;
import com.cg.exception.InsufficientFundException;

import java.io.BufferedReader;
import com.cg.service.AccountService;
public class Mywallet{


	public static void main(String[] args) throws IOException, InsufficientFundException {
		// TODO Auto-generated method stub
		Map<Long,Account> accmap=new TreeMap<Long,Account>();
		AccountService service=new AccountService();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		String choice="";
		while(true) {
		System.out.println("Menu");
		System.out.println("=====");
		System.out.println("1 create new account");
	    System.out.println("2 print all account");
	    System.out.println("3 delete account");
		System.out.println("4 transfer amount");
		System.out.println("5 withdraw amount");
		System.out.println("6 exit");
		System.out.println("Enter your choice");
		choice =br.readLine();
		
		switch(choice)
		{
		  case "1": int id=0;
		          long mb=0L;
		          String ah="";
		          double bal=0.0;
		          //Accepting and validate input for account number
		          System.out.println("Enter account number");
		          while(true) {
		              String s_id=br.readLine();
		              boolean ch1=Validator.validatedate(s_id, Validator.aidpattern);
		              if(ch1==true) {
		            	  try {
		            		  id=Integer.parseInt(s_id);
		            		  break;
		            	  }
		            	  catch(NumberFormatException e)
		            	  {
		            		  System.out.println("Account number must be numeric. re enter");
		            	  }
		            	 
		              }
		              else {
		            	  System.out.println("Re enter account number in 3 digits");
		            	  
		              }
		              
		          
		          }
		       
		          System.out.println("Enter mobile number");
		        
		            
		              while(true) {
		            	  String s_mb=br.readLine();
		              
		              boolean ch1=Validator.validatedate(s_mb, Validator.mobilepattern);
		              if(ch1==true) {
		            	  try {
		            		  mb=Long.parseLong(s_mb);
		            		  break;
		            	  }
		            	  catch(NumberFormatException e)
		            	  {
		            		  System.out.println("mobile number must be numeric. re enter");
		            	  }
		            	 
		              }
		              else {
		            	  System.out.println("Re enter mobile number in 10 digits");
		            	 
		              }//break;
		              } 
		          
		          System.out.println("Enter account holder name");
		        	  ah=br.readLine();
		        	  
		        
		          System.out.println("Enter intial balance");
		          String s_bal=br.readLine();
		          bal=Double.parseDouble(s_bal);
		          
		          Account ob=new Account(id,mb,ah,bal);
		          accmap.put(ob.getMobile(),ob);
		          boolean b=service.addAccount(ob);
		          System.out.println("Successfully added"+" "+b);
		          
		          break;
		         
		case "2":
			
			
			
			Collection<Account> vc=accmap.values();
			List<Account> acclist=new ArrayList<Account>(vc);
			//Collections.sort(acclist);
			for(Account o: acclist) {
				System.out.println(o);
			}
		    break;
		
		case "3":
			
			System.out.println("enter mobile num to delete");
			
			mb= Long.parseLong(br.readLine());
			accmap.remove(mb);
			break;
			
			
			
		case "4":
			System.out.println("enter from account mobile number");
			long from=Long.parseLong(br.readLine());
			System.out.println("enter to account");
			long to=Long.parseLong(br.readLine());
			System.out.println("enter account to transfer mobile number");
			double amount=Double.parseDouble(br.readLine());
			service.transfer(accmap.get(from),accmap.get(to),amount);
			break;
			
		
		case "5": System.out.println("Enter mobile number");
		          long a=Long.parseLong(br.readLine());
		          System.out.println("enter money to withdraw");
		          double am=Double.parseDouble(br.readLine());
		          service.withdraw(accmap.get(a),am);
		          break;
		case "6":
			System.out.println("exitiing program");
			System.exit(0);
		 break;
		 default: System.out.println("Invalid choice");
		
		}
		}//end of menu
		
		
		
		
		
	/*	
		
		System.out.println(accmap);
		System.out.println(accmap.keySet());
		
		Collection<Account> vc=accmap.values();
		List<Account> acclist=new ArrayList<Account>(vc);
		Collections.sort(acclist);
		for(Account o: acclist) {
			System.out.println(o);
		}
		System.out.println("======== sort by name");
		Comparator nc=new BalanceComparator();
		Collections.sort(acclist,nc);
		for(Account o: acclist) {
			System.out.println(o);
		}
		
		System.out.println("======== sort by balance");
		Comparator bc=new BalanceComparator();
		Collections.sort(acclist,bc);
		for(Account o: acclist) {
			System.out.println(o);
		}
	}*/

}
		
	}



