package com.bambuco.salak.dao.impl;
// Generated 29/05/2016 10:31:16 AM by Hibernate Tools 5.1.0.Alpha1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bambuco.salak.model.Tag;

/**
 * Home object for domain model class Tag.
 * @see com.bambuco.salak.model.Tag
 * @author Hibernate Tools
 */
@Stateless
public class TagHome {

	private final static Logger log = LoggerFactory.getLogger(TagHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Tag transientInstance) {
		log.debug("persisting Tag instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Tag persistentInstance) {
		log.debug("removing Tag instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Tag merge(Tag detachedInstance) {
		log.debug("merging Tag instance");
		try {
			Tag result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tag findById(int id) {
		log.debug("getting Tag instance with id: " + id);
		try {
			Tag instance = entityManager.find(Tag.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
