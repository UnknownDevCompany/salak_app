package com.bambucodev.salak.dao;

import javax.ejb.Local;

import com.bambucodev.salak.model.User;

/**
 * 
 * @author PC
 *
 */
@Local
public interface UserDAO extends BaseDAO<User, Long>{

}
