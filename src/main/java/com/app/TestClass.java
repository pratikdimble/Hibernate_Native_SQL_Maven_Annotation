package com.app;


import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestClass {
	public static void main(String[] args) {
		Configuration cfg=null;
		SessionFactory sf=null;
		Session ses=null;
		//activate the hibernate framework
			cfg=new Configuration().configure("hibernate.cfg.xml");
			//build the session factory
			sf=cfg.buildSessionFactory();
			//open/get the session
			ses=sf.openSession();
			
			//create the model class object and set the data
			Employee e=new Employee();
			
			//create then sql query
			
			String sql="SELECT * FROM EMP_NATIVE";
				SQLQuery q=ses.createSQLQuery(sql);
				q.addEntity(Employee.class);
		//execute the query
			List<Employee> emplist=q.list();
			//display the data
			emplist.forEach(row->{
				System.out.println("\t"+row.getId()+"\t"+row.getName()+"\t"+row.getSal());
			});
		
					//close the session factory and session
					ses.close();
					sf.close();
		
	}//main ends

}//class ends
