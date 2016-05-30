package com.bambuco.salak.dao.impl;
// Generated 29/05/2016 09:49:37 PM by Hibernate Tools 5.1.0.Alpha1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bambuco.salak.dao.ProductTagDAO;
import com.bambuco.salak.model.ProductTag;

/**
 * Home object for domain model class ProductTag.
 * 
 * @see com.bambuco.salak.model.ProductTag
 * @author Hibernate Tools
 */
@Stateless
public class ProductTagDAOImpl extends BaseDAOImpl<ProductTag, Long> implements ProductTagDAO{

	private static final Logger log = LoggerFactory.getLogger(ProductTagDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

}
