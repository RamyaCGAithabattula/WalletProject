package cg;
import java.util.*;
public class Demo1 {

	 public static void main(String[] args){
		 Set col=new HashSet();
		 col.add("Ram");
		 col.add("sham");
		 col.add("abdul");
		 col.add(55);
		 col.add(null);
		 col.add("ganesh");
		 col.add("Ram");
		 System.out.println(col);
		 System.out.println(col.size());
	 }
}
