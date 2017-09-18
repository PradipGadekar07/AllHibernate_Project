package com.HibernateAnnoration.onetable;
				
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
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
		  
		  Cricketers ckt=new Cricketers();
		  ckt.setCricketername("M.S.Dhoni");
		  ckt.setJerseyno(7);
		  
		  T20Players t=new T20Players();
		  t.setCountry("IND");
		  t.setPlayerage(36);
		  session.save(ckt);
		  session.save(t);
		  
		  session.getTransaction().commit();
		  session.close();
	}

}