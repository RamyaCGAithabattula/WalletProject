package com.cg.eis.dao;
import java.util.Map;
import com.cg.eis.bean.Employee;
public interface DaoInterface{
	public boolean addEmployee(Employee e);
	public Map<Integer,Employee> getAllEmployee();
	public String getScheme(int eid,double salary,String designation);
}
