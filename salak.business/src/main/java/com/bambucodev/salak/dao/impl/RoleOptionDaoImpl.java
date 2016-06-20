/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bambucodev.salak.dao.impl;

import com.bambucodev.salakapp.model.RoleOption;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ing. Jefferson Pérez Cervera <www.expertla.com>
 */
@Stateless
public class RoleOptionDaoImpl extends BaseDaoImpl<RoleOption> {
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
