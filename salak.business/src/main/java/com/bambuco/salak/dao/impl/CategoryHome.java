package com.bambuco.salak.dao.impl;
// Generated 29/05/2016 10:31:16 AM by Hibernate Tools 5.1.0.Alpha1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bambuco.salak.model.Category;


/**
 * Home object for domain model class Category.
 * @see com.bambuco.salak.model.Category
 * @author Hibernate Tools
 */
@Stateless
public class CategoryHome {

	private final static Logger log = LoggerFactory.getLogger(CategoryHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Category transientInstance) {
		log.debug("persisting Category instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Category persistentInstance) {
		log.debug("removing Category instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Category merge(Category detachedInstance) {
		log.debug("merging Category instance");
		try {
			Category result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Category findById(int id) {
		log.debug("getting Category instance with id: " + id);
		try {
			Category instance = entityManager.find(Category.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
