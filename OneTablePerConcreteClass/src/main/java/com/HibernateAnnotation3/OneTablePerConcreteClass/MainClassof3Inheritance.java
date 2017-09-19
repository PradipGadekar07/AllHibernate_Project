package com.HibernateAnnotation3.OneTablePerConcreteClass;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class MainClassof3Inheritance {

	public static void main(String[] args) {
    
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		 WWE w=new WWE(7, "Roman Reign");
				  
		  WWEMen wm=new WWEMen(5, "Bailey","hardy", 25);
		  
		  WWEWomen ww=new WWEWomen(9,"wer");
		
		  session.save(w);
		  session.save(wm);
		  session.save(ww);
		  
		  session.getTransaction().commit();
		  session.close();
	}
}