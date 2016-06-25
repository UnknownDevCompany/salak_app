package com.bambucodev.salak.dao.impl;

import javax.ejb.Stateless;

import com.bambucodev.salak.dao.ProductTagDao;
import com.bambucodev.salak.model.ProductTag;

/**
 *
 * @author Ing. Jefferson Pérez Cervera <www.bambucodev.com>
 */
@Stateless
public class ProductTagDaoImpl extends BaseDaoImpl<ProductTag> implements ProductTagDao {
    

    public ProductTagDaoImpl() {
        super(ProductTag.class);
    }
    
}
