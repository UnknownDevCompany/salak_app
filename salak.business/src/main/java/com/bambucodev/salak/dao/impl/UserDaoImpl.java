package com.bambucodev.salak.dao.impl;

import javax.ejb.Stateless;

import com.bambucodev.salak.dao.UserDao;
import com.bambucodev.salak.model.User;

/**
 *
 * @author Ing. Jefferson Pérez Cervera <www.bambucodev.com>
 */
@Stateless
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
    

    public UserDaoImpl() {
        super(User.class);
    }
    
}
