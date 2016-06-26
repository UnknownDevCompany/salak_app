package com.bambucodev.salak.dao.impl;

import javax.ejb.Stateless;

import com.bambucodev.salak.dao.ModuleDao;
import com.bambucodev.salak.model.Module;

/**
 *
 * @author Ing. Jefferson Pérez Cervera <www.bambucodev.com>
 */
@Stateless
public class ModuleDaoImpl extends BaseDaoImpl<Module> implements ModuleDao {
    
    public ModuleDaoImpl() {
        super(Module.class);
    }
    
}
