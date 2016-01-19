package com.sachin.project;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.management.Query;

public interface Library_interface<T, ID extends Serializable> {
	public void save(T entity);

	public void merge(T entity);

	public void delete(T entity);

	public List<T> findMany(Query query);

	public T findOne(Query query);

	public List findAll(Class clazz);

	public T findByID(Class clazz, BigDecimal id);

	//void save(T entity);

}
