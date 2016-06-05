package com.bambuco.salak.dao.impl;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.usertype.ParameterizedType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bambuco.salak.dao.BaseDAO;

/**
 * 
 * @author PC
 *
 * @param <E>
 * @param <K>
 */
public class BaseDAOImpl<E, K extends Serializable> implements BaseDAO<E, K> {

	private static final Logger log = LoggerFactory.getLogger(BaseDAOImpl.class);
	protected Class entityClass;

	@PersistenceContext
	private EntityManager entityManager;

	public BaseDAOImpl() {
		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
		this.entityClass = genericSuperclass.getClass();
	}

	public void persist(E transientInstance) {
		log.debug("persisting Option instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(E persistentInstance) {
		log.debug("removing Option instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public E merge(E detachedInstance) {
		log.debug("merging Option instance");
		try {
			E result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public E findById(K id) {
		log.debug("getting Option instance with id: " + id);
		try {
			E instance = (E) entityManager.find(entityClass, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

}
