package com.cg.eis.service;
import java.security.PublicKey;
import java.util.Map;
import com.cg.eis.bean.*;
public interface ServiceInterface {
	
	    public boolean addEmployee(Employee e);
	    public Map<Integer,Employee> getAllEmployee();
	    public String  getScheme(int eid,double salary,String designation);
	    public default void printEmployeedetails(Employee e) {
	    	 System.out.println("===========");
	    	 System.out.println("Employee Id"+e.getEid());
	    	 System.out.println("Employee Name"+e.getEname());
	    	 System.out.println("Employee Salary"+e.getSalary());
	    	 System.out.println("Employee Designation"+e.getDesignation());
	    	 System.out.println("Employee Scheme"+e.getInsurancescheme());
	    	 System.out.println("===========");
	    }

}
