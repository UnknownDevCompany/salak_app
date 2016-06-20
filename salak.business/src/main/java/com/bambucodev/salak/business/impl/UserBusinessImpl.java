package com.bambucodev.salak.business.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bambucodev.salak.business.UserBusiness;
import com.bambucodev.salak.dao.UserDAO;
import com.bambucodev.salak.model.User;

/**
 * 
 * @author jefferpc
 *
 */
@Stateless
public class UserBusinessImpl implements UserBusiness {

	private static final Logger log = LoggerFactory.getLogger(UserBusinessImpl.class);
	
	@EJB
	private UserDAO userDao;

	public List<User> getAll() throws Exception {
		return userDao.findAll();
	}

	

}
