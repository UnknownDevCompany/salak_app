package com.bambuco.salak.dao.impl;
// Generated 29/05/2016 09:49:37 PM by Hibernate Tools 5.1.0.Alpha1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bambuco.salak.dao.RoleOptionDAO;
import com.bambuco.salak.model.RoleOption;

/**
 * Home object for domain model class RoleOption.
 * 
 * @see com.bambuco.salak.model.RoleOption
 * @author Hibernate Tools
 */
@Stateless
public class RoleOptionDAOImpl extends BaseDAOImpl<RoleOption, Long> implements RoleOptionDAO{

	private static final Logger log = LoggerFactory.getLogger(RoleOptionDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

}
