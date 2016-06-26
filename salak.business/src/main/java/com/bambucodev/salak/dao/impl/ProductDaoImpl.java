package com.bambucodev.salak.dao.impl;

import javax.ejb.Stateless;

import com.bambucodev.salak.dao.ProductDao;
import com.bambucodev.salak.model.Product;

/**
 * 
 * @author Ing. Jefferson Pérez Cervera <www.bambucodev.com>
 */
@Stateless
public class ProductDaoImpl extends BaseDaoImpl<Product> implements ProductDao {
    

    public ProductDaoImpl() {
        super(Product.class);
    }
    
}
