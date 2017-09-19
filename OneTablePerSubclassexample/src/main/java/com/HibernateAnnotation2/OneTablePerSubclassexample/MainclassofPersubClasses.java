package com.HibernateAnnotation2.OneTablePerSubclassexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class MainclassofPersubClasses {

	public static void main(String[] args) {
    
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  Sports sp=new Sports();
		  sp.setSport_name("cricket");
		  sp.setSport_type("outdoor");
		  
		  
		  Cricket ck=new Cricket();
		  ck.setSport_name("t20");
		  ck.setSport_type("out");
		  ck.setNo_of_players(11);
		  ck.setCricket_format("odi");
		 
		  
		  Badminton bd=new Badminton();
		  bd.setSport_name("kabbadi");
		  bd.setSport_type("indoor");
		  bd.setClub("umumba");
		  bd.setTrophy("domestic");
		  
		  session.save(sp);
		  session.save(ck);
		  session.save(bd);
		  
		  session.getTransaction().commit();
		  session.close();
	}

}
