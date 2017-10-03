package com.HibernateCriteria.CriteriaQueriesExample;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.ordering.antlr.Factory;

public class MainCriteria {
	private static SessionFactory sessionFactory;

	public static void main(String[] args) {

		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  Employee e1=new Employee();
		  e1.setFirstName("MahendraSingh");
		  e1.setLastName("Dhoni");
		  e1.setSalary(50000000);
		  
		  Employee e2=new Employee();
		  e2.setFirstName("Suresh");
		  e2.setLastName("Raina");
		  e2.setSalary(800000);
		  
		  Employee e3=new Employee();
		  e3.setFirstName("Yuvraj");
		  e3.setLastName("Singh");
		  e3.setSalary(9000000);
		  
		  Employee e4=new Employee();
		  e4.setFirstName("Virat");
		  e4.setLastName("Kohli");
		  e4.setSalary(10000);
		  
		  Employee e5=new Employee();
		  e5.setFirstName("Hardik");
		  e5.setLastName("Pandya");
		  e5.setSalary(30000);
		  
		  session.save(e1);
		  session.save(e2);
		  session.save(e3);
		  session.save(e4);
		  session.save(e5);
		  
		  Criteria cr = session.createCriteria(Employee.class);
		  cr.addOrder(Order.asc("lastName"));
		  
		  cr.setFirstResult(0);
		  cr.setMaxResults(10);
		  
		  List<Employee> emp=cr.list();
		  
		  for(Employee employee:emp)
		  {
		   System.out.print("e_id="+employee.getId()+"\t\t");
		   System.out.print("e_firstName="+employee.getFirstName()+"\t\t");
		   System.out.print("e_lastname="+employee.getLastName()+"\t\t");
		   System.out.print("e_salary="+employee.getSalary()+"\n\n");
		  }
		 
		 /* cr.setProjection(Projections.rowCount());
	         List<Employee> rowCount = cr.list();

	         System.out.println("Total Count: " + rowCount.get(0));
		  
*/		  session.getTransaction().commit();
		  session.close();
	} 
	}

		 


	

