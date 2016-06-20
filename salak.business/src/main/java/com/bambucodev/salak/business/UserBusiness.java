package com.bambucodev.salak.business;

import java.util.List;

import javax.ejb.Local;

import com.bambucodev.salak.model.User;

/**
 * @author jefferpc
 *
 */
@Local
public interface UserBusiness {
	
	public List<User> findAll()throws Exception;
	
}
