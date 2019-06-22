package cg;
import java.util.*;
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map<String,Double> m=new HashMap<String,Double>();
		// Map<String,Double> m=new TreeMap<String,Double>();
         m.put("Ram",5000.00);
         m.put("Sham",7000.00);
         m.put("Abdul",9000.00);
         m.put("Ganesh",4000.00);
        // m.remove("Ganesh");
        // m.put(null,5000.00);
         System.out.println(m);
         System.out.println(m.size());
         Set<String> KeysSet=m.keySet();
         System.out.println(KeysSet);
         
         for(String k: KeysSet)
         {
        	 Double val=m.get(k);
        	 System.out.println(k+ " has balance of Rs."+val); 
         }
         
         System.out.println("==========");
         Double bal =m.get("Sham");
         System.out.println("Before balance"+bal);
         bal=bal-3000.00;
         m.put("Sham",bal);
         bal=m.get("Sham");
         System.out.println("After balance" +bal);
         System.out.println("==========");
         Collection<Double> vals=m.values();
         List<Double> vallist=new ArrayList<Double>(vals);
         Collections.sort(vallist);
         for(double d: vallist)
         {
        	System.out.println(d);
         }
	}

}
