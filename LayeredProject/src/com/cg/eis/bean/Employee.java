package com.cg.eis.bean;
public class Employee {
	public int eid;
	public String ename;
	public double salary;
	public String designation;
	public String insurancescheme;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, double salary, String designation, String insurancescheme) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.designation = designation;
		this.insurancescheme = insurancescheme;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsurancescheme() {
		return insurancescheme;
	}
	public void setInsurancescheme(String insurancescheme) {
		this.insurancescheme = insurancescheme;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", designation=" + designation
				+ ", insurancescheme=" + insurancescheme + "]";
	}
	public int compareTo(Employee e) {
		int diff=this.getEid()-e.getEid();
		if(diff>0)
			return 1;
		else if(diff<0)
			return -1;
		else
		    return 0;
		
	}
}
