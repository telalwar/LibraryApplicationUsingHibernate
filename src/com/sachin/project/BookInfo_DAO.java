package com.sachin.project;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BookInfo_DAO extends LibraryDAOImpl<BookInfo_Model, Serializable> {
	List<BookInfo_Model> result;

	public List<BookInfo_Model> searchBook(String bookName) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		String hql = "SELECT object(s) FROM BookInfo_Model s WHERE s.Book_Name = '"
				+ bookName + "'";
		Query query = session.createQuery(hql);
		List<BookInfo_Model> result = query.list();

		return result;

	}
}
