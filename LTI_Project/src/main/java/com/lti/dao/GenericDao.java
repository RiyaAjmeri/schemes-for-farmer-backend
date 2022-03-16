package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GenericDao {

	public void save(Object obj) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LTI_Project");

		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.merge(obj);
		tx.commit();

		emf.close();

	}

	public Object fetchById(Class clazz, Object pk) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LTI_Project");

		EntityManager em = emf.createEntityManager();
		Object obj = em.find(clazz, pk);
		emf.close();
		return obj;
	}
	/*
	 * public <E> E fetchByIdV2(Class<E> clazz, Object pk) { EntityManagerFactory
	 * emf = Persistence.createEntityManagerFactory("hibernate-demo"); EntityManager
	 * em = emf.createEntityManager();
	 * 
	 * E e = em.find(clazz, pk); emf.close(); return e; }
	 */

}
