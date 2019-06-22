package com.cg.as;
import java.util.Scanner;

import com.cg.as.Power;
public class PowerMain {
                 public static void main(String[] args) {
                	     Power p=new Power();
                	     System.out.println("Enter number");
                	     Scanner sc=new Scanner(System.in);
                	     int n=sc.nextInt();
                	  
                	     if(p.pow(n)) {
                	    	 System.out.println("It is the power of 2");
                	     }
                	     else
                	     {
                	    	 System.out.println("Not a power of 2");
                	     }
                	     
                 }
}

