package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.service.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;
import com.cg.eis.bean.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int eid=0;
		String ename="";
		double salary=0L;
		String designation="";
		String isuranceScheme="";
		String input="";
		ServiceClass em=new ServiceClass();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String choice="";
		while(true) {
		System.out.println("Menu");
		System.out.println("=====");
		System.out.println("1 Employee details");
	    System.out.println("2 Find Scheme");
		System.out.println("3 show Employee data");
		System.out.println("4 Exit");
		System.out.println("=====");
		System.out.println("Enter your choice");
		choice=br.readLine();
		switch(choice) {
		
		case "1": 
			     System.out.println("enter Employee ID");
			     while(true) {
			    	 input=br.readLine();
			    	 boolean ch1=Validator.validatedata(input, Validator.eidpattern);
			    	 if(ch1==true) {
			    		 try {
			    			 eid=Integer.parseInt(input);
			    			 break;
			    		 }
			    		 catch(NumberFormatException e) {
			    			 System.out.println("Employee Id must be numeric Re enter");
			    		 }
			    	 }
			    		 else {
			    			 System.out.println("Re enter Employee ID in 3 digits");
			    		 }
			     }
			    	 
			    	 System.out.println("Enter Employee salary");
			    	 while(true){
			    		 input br.readLine();
			    		 boolean ch1=Validator.validatedata(input,Validator.salary);
			    		 if(ch1==true) {
			    			 try{
			    				 salary=Double.parseDouble(input);
			    				 break;
			    			 }
			    			 catch(NumberFormatException e) {
			    				 System.out.println("Salary must be numeric re enter");
			    			 }
			    		 }
			    			 else {
			    				 System.out.println("Re enter salary");
			    			 }
			    		 }
			    	 System.out.println("re enetr Employee Designation");
			    	 while(true) {
			    		 input br.readLine();
			    		 if(input.equalsIgnoreCase("Sytem Associate")||input.equalsIgnoreCase("Programmer")||(input.equalsIgnoreCase("Manager")||input.equalsIgnoreCase("Clerk"))) {
			    			 designation=input;
			    			 break;
			    		 }
			    		 else {
			    			 System.out.println(eid,salary,designation);
			    			 System.out.println("hint: System Associate Or Manager or Programmer Or Clerk");
			    		 }
			    		 }
			    	 insurancescheme=em.getScheme(eid, salary, designation);
			    	 Employee e =new Employee(eid,ename,salary,designation,insurancescheme);
			    	 em.addEmployee(e);
			    	 System.out.println("Employee added");
			    	 break;
		case "2" :
			       System.out.println("Enter Employee Salary");
			       while(true) {
			    	   input=br.readLine();
			    	   boolean ch1=Validator.validatedata(input,Validator.salary);
			    	   if(ch1==true) {
			    		   try {
			    			   salary=double.parseDouble(input);
			    			   break;
			    		   }
			    		   catch(NumberFormatExcepetion c)
			    		   {
			    			   System.out.println("salary must be numeric. reenter");
			    			   
			    		   }
			    	   }
			    	   else {
			    		   System.out.println("reenter salary");
			    	   }
			       }
			       System.out.println("enter employee designation");
			       
			    	 }
			     }
		
				insurancescheme=em.getScheme(eid, salary, designation);
				System.out.println("insurance scheme",insurancescheme);
				break;
				case "3":
					   Map <Integer,Employee> accmap=em.getAllEmployee();
					   Collection<Employee> vc=accmap.values();
					   List<Employee> acclist=new ArrayList<Employee><vc>;
					   Collection.sort(acclist);
					   for(Employee o: acclist)
					   {
						   em.printEmployeedetails(o);
					   }
				break;
				case "4" :
					   System.out.println("Exiting program");
					   System.exit(0);
					   break;
			  default :
						   System.out.println("Invalid choice");

	}
	}
}
}
