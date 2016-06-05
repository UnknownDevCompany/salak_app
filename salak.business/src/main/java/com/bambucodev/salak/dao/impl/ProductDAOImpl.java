package com.bambuco.salak.dao.impl;
// Generated 29/05/2016 09:49:37 PM by Hibernate Tools 5.1.0.Alpha1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bambuco.salak.dao.ProductDAO;
import com.bambuco.salak.model.Product;

/**
 * Home object for domain model class Product.
 * 
 * @see com.bambuco.salak.model.Product
 * @author Hibernate Tools
 */
@Stateless
public class ProductDAOImpl extends BaseDAOImpl<Product, Long> implements ProductDAO{

	private static final Logger log = LoggerFactory.getLogger(ProductDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

}
