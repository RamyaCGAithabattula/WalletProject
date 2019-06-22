package com.cg.eis.dao;
import java.util.HashMap;
import java.util.Map;
import org.omg.Messaging.SyncScopeHelper;
import com.cg.eis.bean.Employee;
public class DaoClass implements DaoInterface{
      static Map<Integer,Employee> emmap=new HashMap<Integer,Employee>();
	@Override
	public boolean addEmployee(Employee e) {
		// TODO Auto-generated method stub
		emmap.put(e.getEid(),e);
		return true;
	}

	@Override
	public Map<Integer, Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return emmap;
	}

	@Override
	public String getScheme(int eid, double salary, String designation) {
		// TODO Auto-generated method stub
		
		if(((salary>=5000)&&(salary<20000))&&(designation.equalsIgnoreCase("System Associate"))) {
			return "scheme c";
		}
		else if(((salary>=20000)&&(salary<4000))&&(designation.equalsIgnoreCase("Programmer"))) {
		return "scheme B";
	}
		else if((salary>=4000)&&(designation.equalsIgnoreCase("Manager"))) {
			return "scheme A";
		}
		else if((salary<5000)&&(designation.equalsIgnoreCase("Clerk"))) {
			return "No Scheme";
		
	}
		else
		{
			return "Invalid Details";
		}
	
}
}
