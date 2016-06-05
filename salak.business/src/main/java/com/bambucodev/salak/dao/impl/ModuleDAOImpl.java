package com.bambuco.salak.dao.impl;
// Generated 29/05/2016 09:49:37 PM by Hibernate Tools 5.1.0.Alpha1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bambuco.salak.dao.ModuleDAO;
import com.bambuco.salak.model.Module;

/**
 * Home object for domain model class Module.
 * 
 * @see com.bambuco.salak.model.Module
 * @author Hibernate Tools
 */
@Stateless
public class ModuleDAOImpl extends BaseDAOImpl<Module, Long> implements ModuleDAO{

	private static final Logger log = LoggerFactory.getLogger(ModuleDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

}
