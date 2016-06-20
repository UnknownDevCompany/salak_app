/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bambucodev.salak.dao.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.bambucodev.salak.model.Module;

/**
 *
 * @author Ing. Jefferson Pérez Cervera <www.expertla.com>
 */
@Stateless
public class ModuleDaoImpl extends BaseDaoImpl<Module> {
    
    public ModuleDaoImpl() {
        super(Module.class);
    }
    
}
