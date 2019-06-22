package com.cg.as;

import java.util.Scanner;

public class IncreasingNum {
	public static void main(String[] args) {
             int num;
             boolean flag=false;
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter number");
             num=sc.nextInt();
             int cd=num%10;
             num=num/10;
             while(num>0) {
            	 if(cd<=num%10) {
            		 flag=true;
            		 break;
            	 }
            	 cd=num%10;
            	 num=num/10;
             }
             if(flag) {
            	 System.out.println("Not in increasing order");
             }
             else
             {
            	 System.out.println("Increasing order");
             }
             
}
}
