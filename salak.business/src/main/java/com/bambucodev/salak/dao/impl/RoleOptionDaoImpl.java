package com.bambucodev.salak.dao.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.bambucodev.salak.dao.RoleOptionDao;
import com.bambucodev.salak.model.RoleOption;

/**
 *
 * @author Ing. Jefferson Pérez Cervera <www.expertla.com>
 */	
@Stateless
public class RoleOptionDaoImpl extends BaseDaoImpl<RoleOption> implements RoleOptionDao {
    @PersistenceContext(unitName = "SalakAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RoleOptionDaoImpl() {
        super(RoleOption.class);
    }
    
}
