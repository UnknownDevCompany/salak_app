package com.bambucodev.salak.dao;

import javax.ejb.Local;

import com.bambucodev.salak.model.Product;

/**
 * 
 * @author PC
 *
 */
@Local
public interface ProductDAO extends BaseDAO<Product, Long>{

}
