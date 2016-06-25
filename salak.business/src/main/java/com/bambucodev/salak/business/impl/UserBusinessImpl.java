package com.bambucodev.salak.business.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bambucodev.salak.business.UserBusiness;
import com.bambucodev.salak.dao.BaseDao;
import com.bambucodev.salak.model.User;

/**
 * 
 * @author jefferpc
 *
 */
@Stateless
public class UserBusinessImpl extends BaseBusinessImpl<User> implements UserBusiness {

	private static final Logger log = LogManager.getLogger();
	@EJB
	protected UserDao userDao;

	@Override
	protected BaseDao<User> getBaseDao() {
		return userDAo;
	}



	

}
