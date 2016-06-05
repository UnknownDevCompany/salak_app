package com.bambucodev.salak.dao.impl;
// Generated 29/05/2016 09:49:37 PM by Hibernate Tools 5.1.0.Alpha1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bambucodev.salak.dao.UserDAO;
import com.bambucodev.salak.model.User;

/**
 * Home object for domain model class User.
 * 
 * @see com.bambucodev.salak.model.User
 * @author jefferpc
 */
@Stateless
public class UserDAOImpl extends BaseDAOImpl<User, Long> {

	private static final Logger log = LoggerFactory.getLogger(UserDAOImpl.class);


}
