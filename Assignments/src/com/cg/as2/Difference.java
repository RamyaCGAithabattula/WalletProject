package com.cg.as2;

public class Difference {
	         public int n;
	        			 static int diff(int n) {
					int l,k,m;
					l=(n*(n+1)*(2*n+1))/6;
					k=(n*(n+1))/2;
					k=k*k;
					m=Math.abs(l-k);
					return m;
					
				}
		   

}
