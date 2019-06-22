package cg;
import com.cg.bean.*;
import java.util.*;
public class NameComparator implements Comparator<Account>{

	@Override
	public int compare(Account arg0, Account arg1) {
		
		String ah1=arg0.getAccountHolder();
		String ah2=arg1.getAccountHolder();
		int a=ah1.compareTo(ah2);
		// TODO Auto-generated method stub
		return a;
	} 
	
	

}
