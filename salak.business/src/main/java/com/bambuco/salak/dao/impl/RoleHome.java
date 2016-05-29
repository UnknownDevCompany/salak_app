package com.bambuco.salak.dao.impl;
// Generated 29/05/2016 10:31:16 AM by Hibernate Tools 5.1.0.Alpha1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bambuco.salak.model.Role;

/**
 * Home object for domain model class Role.
 * @see com.bambuco.salak.model.Role
 * @author Hibernate Tools
 */
@Stateless
public class RoleHome {

	private final static Logger log = LoggerFactory.getLogger(RoleHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Role transientInstance) {
		log.debug("persisting Role instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Role persistentInstance) {
		log.debug("removing Role instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Role merge(Role detachedInstance) {
		log.debug("merging Role instance");
		try {
			Role result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Role findById(int id) {
		log.debug("getting Role instance with id: " + id);
		try {
			Role instance = entityManager.find(Role.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
