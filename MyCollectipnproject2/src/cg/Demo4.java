package cg;
import java.util.*;
import com.cg.bean.*;
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Long,Account> accmap=new TreeMap<Long,Account>();
		
		Account ob1=new Account(101,982793684,"Ram",25000.00);
		accmap.put(ob1.getMobile(),ob1);
		
		Account ob2=new Account(102,328434929,"Sham",15000.00);
		accmap.put(ob2.getMobile(),ob2);
		
		Account ob3=new Account(105,328434929,"Abdul",45000.00);
		accmap.put(ob3.getMobile(),ob3);
		
		Account ob4=new Account(103,328434929,"Ganesh",55000.00);
		accmap.put(ob4.getMobile(),ob4);
		
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
	}

}
