package com.bambuco.salak.dao.impl;
// Generated 29/05/2016 09:49:37 PM by Hibernate Tools 5.1.0.Alpha1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bambuco.salak.dao.RoleDAO;
import com.bambuco.salak.model.Role;

/**
 * Home object for domain model class Role.
 * 
 * @see com.bambuco.salak.model.Role
 * @author Hibernate Tools
 */
@Stateless
public class RoleDAOImpl extends BaseDAOImpl<Role, Long> implements RoleDAO{

	private static final Logger log = LoggerFactory.getLogger(RoleDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

}
