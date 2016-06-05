package com.bambuco.salak.dao;

import javax.ejb.Local;

import com.bambuco.salak.model.User;

/**
 * 
 * @author PC
 *
 */
@Local
public interface UserDAO extends BaseDAO<User, Long>{

}
