package com.bambuco.salak.dao;

import javax.ejb.Local;

import com.bambuco.salak.model.Product;

/**
 * 
 * @author PC
 *
 */
@Local
public interface ProductDAO extends BaseDAO<Product, Long>{

}
