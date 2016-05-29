package com.bambuco.salak.dao.impl;
// Generated 29/05/2016 10:31:16 AM by Hibernate Tools 5.1.0.Alpha1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bambuco.salak.model.Option;

/**
 * Home object for domain model class Option.
 * @see com.bambuco.salak.model.Option
 * @author Hibernate Tools
 */
@Stateless
public class OptionHome {

	private final static Logger log = LoggerFactory.getLogger(OptionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Option transientInstance) {
		log.debug("persisting Option instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Option persistentInstance) {
		log.debug("removing Option instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Option merge(Option detachedInstance) {
		log.debug("merging Option instance");
		try {
			Option result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Option findById(int id) {
		log.debug("getting Option instance with id: " + id);
		try {
			Option instance = entityManager.find(Option.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
