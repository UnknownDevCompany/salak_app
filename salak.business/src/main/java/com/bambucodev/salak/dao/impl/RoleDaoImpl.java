package com.bambucodev.salak.dao.impl;

import javax.ejb.Stateless;

import com.bambucodev.salak.dao.RoleDao;
import com.bambucodev.salak.model.Role;

/**
 *
 * @author Ing. Jefferson Pérez Cervera <www.bambucodev.com>
 */
@Stateless
public class RoleDaoImpl extends BaseDaoImpl<Role> implements RoleDao {
    
    public RoleDaoImpl() {
        super(Role.class);
    }
    
}
