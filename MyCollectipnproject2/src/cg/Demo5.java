package cg;
import java.util.*;
import java.io.*;
import com.cg.service.*;
import com.cg.bean.*;
import java.io.BufferedReader;
public class Demo5 {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Map<Long,Account> accmap=new TreeMap<Long,Account>();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		String choice="";
		while(true) {
		System.out.println("Menu");
		System.out.println("=====");
		System.out.println("1 create new account");
	    System.out.println("2 print all accounts");
		System.out.println("3 exit");
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
		        	  String s_ah=br.readLine();
		        	  
		        
		          System.out.println("Enter intial balance");
		          String s_bal=br.readLine();
		          bal=Double.parseDouble(s_bal);
		          Account ob=new Account(id,mb,ah,bal);
		          accmap.put(ob.getMobile(),ob);
		          
		          break;
		         
		case "2":
			
			
			
			Collection<Account> vc=accmap.values();
			List<Account> acclist=new ArrayList<Account>(vc);
			Collections.sort(acclist);
			for(Account o: acclist) {
				System.out.println(o);
			}
		    break;
		case "3": System.out.println("Exiting program");
		
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
