package com.bambuco.salak.dao.impl;
// Generated 29/05/2016 10:31:16 AM by Hibernate Tools 5.1.0.Alpha1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bambuco.salak.model.ProductTag;


/**
 * Home object for domain model class ProductTag.
 * @see com.bambuco.salak.model.ProductTag
 * @author Hibernate Tools
 */
@Stateless
public class ProductTagHome {

	
	private final static Logger log = LoggerFactory.getLogger(ProductTagHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProductTag transientInstance) {
		log.debug("persisting ProductTag instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProductTag persistentInstance) {
		log.debug("removing ProductTag instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProductTag merge(ProductTag detachedInstance) {
		log.debug("merging ProductTag instance");
		try {
			ProductTag result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProductTag findById(int id) {
		log.debug("getting ProductTag instance with id: " + id);
		try {
			ProductTag instance = entityManager.find(ProductTag.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
