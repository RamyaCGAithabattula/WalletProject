package cg;
import java.util.HashSet;
import java.util.*;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set<String> col=new TreeSet<String>();
		 List<String> col=new ArrayList<String>();
		 col.add("Ram");
		 col.add("sham");
		 col.add("abdul");
		 //col.add(55);
		 col.add(null);
		 col.add("ganesh");
		 col.add("Ram");
		 System.out.println(col);
		 System.out.println(col.size());
		 
		 System.out.println("===========");
		 
		 for(String s:col) {
			 System.out.println(s);
		 }
		 
		 System.out.println("===========");
		 
		 Iterator<String> it=col.iterator();
		 while(it.hasNext()) {
			 String ss=it.next();
			 System.out.println(ss);
		 }

	}

}
