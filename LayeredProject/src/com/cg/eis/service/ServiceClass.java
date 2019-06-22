package com.cg.eis.service;
import java.util.Map;
import com.cg.eis.bean.Employee;
import com.cg.eis.dao.*;
public class ServiceClass implements ServiceInterface {
       DaoClass dao=new DaoClass();
	@Override
	public boolean addEmployee(Employee e) {
		// TODO Auto-generated method stub
		
		return dao.addEmployee(e);
	}

	@Override
	public Map<Integer, Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return dao.getAllEmployee();
	}

	@Override
	public String getScheme(int eid, double salary,String designation) {
		// TODO Auto-generated method stub
		return dao.getScheme(eid, salary, designation);
	}

}
