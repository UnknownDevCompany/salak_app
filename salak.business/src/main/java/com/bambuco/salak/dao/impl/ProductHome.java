package com.bambuco.salak.dao.impl;
// Generated 29/05/2016 10:31:16 AM by Hibernate Tools 5.1.0.Alpha1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bambuco.salak.model.Product;

/**
 * Home object for domain model class Product.
 * @see com.bambuco.salak.model.Product
 * @author Hibernate Tools
 */
@Stateless
public class ProductHome {

	private final static Logger log = LoggerFactory.getLogger(ProductHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Product transientInstance) {
		log.debug("persisting Product instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Product persistentInstance) {
		log.debug("removing Product instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Product merge(Product detachedInstance) {
		log.debug("merging Product instance");
		try {
			Product result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Product findById(int id) {
		log.debug("getting Product instance with id: " + id);
		try {
			Product instance = entityManager.find(Product.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
