package com.cg.as2;

import java.util.Scanner;

public class MainDiff {
	public static void main(String[] args) {
	Difference d=new Difference();
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println(d.diff(n));
}
}