/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bambucodev.salak.dao.impl;

import javax.ejb.Stateless;

import com.bambucodev.salak.model.ProductTag;

/**
 *
 * @author Ing. Jefferson Pérez Cervera <www.bambucodev.com>
 */
@Stateless
public class ProductTagDaoImpl extends BaseDaoImpl<ProductTag> {
    

    public ProductTagDaoImpl() {
        super(ProductTag.class);
    }
    
}
