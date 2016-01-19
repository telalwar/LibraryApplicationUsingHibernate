package com.sachin.project;

import java.util.List;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Student_DAO extends LibraryDAOImpl<Student_Model, Integer> {
	
	public boolean checkUser (String username ,String pass){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session =sessionFactory.openSession();
		String hql = "SELECT object(s) FROM Student_Model s WHERE s.strUserName = '"+ username+"'";
		Query query = session.createQuery(hql);
		List<Student_Model> result = query.list();
		//List<Student_Model> results = ((org.hibernate.Query) query).list();
		
		if(pass.equalsIgnoreCase(result.get(0).getStrPassword())){
		return true;
		}
		else{
			return false;
		}
	}

}
