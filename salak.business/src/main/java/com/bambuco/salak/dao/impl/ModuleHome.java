package com.bambuco.salak.dao.impl;
// Generated 29/05/2016 10:31:16 AM by Hibernate Tools 5.1.0.Alpha1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bambuco.salak.model.Module;


/**
 * Home object for domain model class Module.
 * @see com.bambuco.salak.model.Module
 * @author Hibernate Tools
 */
@Stateless
public class ModuleHome {

	private final static Logger log = LoggerFactory.getLogger(ModuleHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Module transientInstance) {
		log.debug("persisting Module instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Module persistentInstance) {
		log.debug("removing Module instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Module merge(Module detachedInstance) {
		log.debug("merging Module instance");
		try {
			Module result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Module findById(int id) {
		log.debug("getting Module instance with id: " + id);
		try {
			Module instance = entityManager.find(Module.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
