package com.cg.as;
import java.util.*;
public class OperatorMain {
	public static void main(String[] args) {
		Operators o=new Operators();
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(o.Cubes(n));
	}

}
