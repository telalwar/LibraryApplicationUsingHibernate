package com.sachin.project;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Librarian_DAO extends LibraryDAOImpl<Librarian_Model, Serializable> {
	public boolean checkUser (String username ,String pass){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session =sessionFactory.openSession();
		String hql = "SELECT object(s) FROM Librarian_Model s WHERE s.Librarian_UserName = '"+ username+"'";
		Query query = session.createQuery(hql);
		List<Librarian_Model> result = query.list();
		int size = result.size();
		System.out.println("size"+size);
		if(pass.equalsIgnoreCase(result.get(0).getPass())){
		return true;
		}
		else{
			return false;
		}
	}
}
