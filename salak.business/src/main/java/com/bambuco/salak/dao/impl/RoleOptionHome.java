package com.bambuco.salak.dao.impl;
// Generated 29/05/2016 10:31:16 AM by Hibernate Tools 5.1.0.Alpha1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bambuco.salak.model.RoleOption;

/**
 * Home object for domain model class RoleOption.
 * @see com.bambuco.salak.model.RoleOption
 * @author Hibernate Tools
 */
@Stateless
public class RoleOptionHome {

	private final static Logger log = LoggerFactory.getLogger(RoleOptionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(RoleOption transientInstance) {
		log.debug("persisting RoleOption instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(RoleOption persistentInstance) {
		log.debug("removing RoleOption instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public RoleOption merge(RoleOption detachedInstance) {
		log.debug("merging RoleOption instance");
		try {
			RoleOption result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RoleOption findById(int id) {
		log.debug("getting RoleOption instance with id: " + id);
		try {
			RoleOption instance = entityManager.find(RoleOption.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
