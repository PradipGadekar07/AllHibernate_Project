
package com.HibernateNativeQuery.NativeSQL;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;
import org.hsqldb.Session;

/**
 * @author Pradip Gadekar
 *
 */
public class MainNativeSQL {

	public static void main(String[] args) {

		AnnotationConfiguration configuration=new AnnotationConfiguration();  
		   configuration.configure("hibernate.cfg.xml");  
		   SessionFactory sFactory=configuration.buildSessionFactory();  
		    org.hibernate.Session session=sFactory.openSession(); 
		    Transaction tx=session.beginTransaction();
		    Worker wr=new Worker();
		    wr.setId(5);;
		    wr.setDept("IT");
		    wr.setName("Pradip");
		    wr.setSalary(4845.54565);
		    session.save(wr);
		    /*session.createCriteria(Worker.class);
		    Criteria cr = session.createCriteria(Worker.class);
		    cr.add(Restrictions.eq("salary", 2000));
		    List results = cr.list();*/
		    org.hibernate.Query query =session.getNamedQuery("workerbyname");  
		    ((org.hibernate.Query) query).setString("name", "Pradip");  
		          
		    List<Worker> w=((org.hibernate.Query) query).list();  
		          
		    Iterator<Worker> itr=w.iterator();  
		     while(itr.hasNext()){  
		    Worker w1=itr.next();  
		    System.out.println(w1);
		    
		    tx.commit();
		    session.close();
		     }   
	}

}