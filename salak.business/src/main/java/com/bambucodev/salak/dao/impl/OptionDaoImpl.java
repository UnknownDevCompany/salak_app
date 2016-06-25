package com.bambucodev.salak.dao.impl;

import javax.ejb.Stateless;

import com.bambucodev.salak.dao.OptionDao;
import com.bambucodev.salak.model.Option;

/**
 *
 * @author Ing. Jefferson Pérez Cervera <www.bambucodev.com>
 */
@Stateless
public class OptionDaoImpl extends BaseDaoImpl<Option> implements OptionDao {
    
    public OptionDaoImpl() {
        super(Option.class);
    }
    
}
