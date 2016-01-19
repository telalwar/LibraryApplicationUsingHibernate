package com.sachin.project;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class LibraryDAOImpl<T,ID extends Serializable> implements Library_interface {

	@Override
	public void save(Object entity) {
		// TODO Auto-generated method stub
		try {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session =sessionFactory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	@Override
	public void merge(Object entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Object entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List findMany(Query query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object findOne(Query query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findAll(Class clazz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object findByID(Class clazz, BigDecimal id) {
		// TODO Auto-generated method stub
		return null;
	}

}
