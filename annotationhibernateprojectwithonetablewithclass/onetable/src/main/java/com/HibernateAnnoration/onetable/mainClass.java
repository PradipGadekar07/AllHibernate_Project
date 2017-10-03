package com.HibernateAnnoration.onetable;
				
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;
/**
 * 
 * 
 * @author Pradip Gadekar
 * business logic of project in this main class 
 *
 */
public class mainClass {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  Cricketers ckt1=new Cricketers();
		  Cricketers ckt2=new Cricketers();
		  Cricketers ckt3=new Cricketers();
		  Cricketers ckt4=new Cricketers();
		  ckt1.setCricketername("M.S.Dhoni");
		  ckt1.setJerseyno(7);
		  ckt2.setCricketername("yuvi");
		  ckt2.setJerseyno(12);
		  ckt3.setCricketername("pandya");
		  ckt3.setJerseyno(57);
		  ckt4.setCricketername("sehwag");
		  ckt4.setJerseyno(89);
		  		  
		  T20Players t=new T20Players();
		  t.setCountry("IND");
		  t.setPlayerage(36);
		  session.save(ckt1);
		  session.save(ckt2);
		  session.save(ckt3);
		  session.save(ckt4);

		  session.save(t);
		/*  //use of criteria api in query
		  Criteria cr = session.createCriteria(Cricketers.class);
		  cr.add(Restrictions.gt("CRICKETER_JERSEYNO", 10));
		  cr.setProjection(Projections.
          List<Cricketers> clist=cr.list();
          for (Iterator iterator = clist.iterator(); iterator.hasNext();)
          {
			   Cricketers e = (Cricketers) iterator.next(); 
			   System.out.print("Cricketer Name: " + e.getCricketername()); 
			   System.out.print(" Jerseyno: " + e.getJerseyno()); 
			}*/
		  session.getTransaction().commit();
		  session.close();
	}
}
