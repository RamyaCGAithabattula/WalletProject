package com.cg.as;

public class CalculateSum {
	         public int n;
	        			 static int sum(int n) {
					int s1,s2,s3;
					s1=((n/3))*(2*3+(n/3-1)*3)/2;
					s2=((n/5))*(2*5+(n/5-1)*5)/2;
					s3=((n/(15)))*(2*(15)*(n/(15)-1)*(15))/2;
					return s1+s2-s3;
					
				}
		   

}
