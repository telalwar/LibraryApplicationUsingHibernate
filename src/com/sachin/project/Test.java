package com.sachin.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {
	Student_Model obj1;
	public Test(Student_Model obj){
		
		 obj1= obj;
	}
public void save(){
	//SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session =sessionFactory.openSession();
	session.beginTransaction();
	session.save(obj1);
	session.getTransaction().commit();
	session.close();
	sessionFactory.close();
	
	
	
}
}
