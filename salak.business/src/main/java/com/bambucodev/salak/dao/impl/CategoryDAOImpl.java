package com.bambuco.salak.dao.impl;
// Generated 29/05/2016 09:49:37 PM by Hibernate Tools 5.1.0.Alpha1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bambuco.salak.dao.CategoryDAO;
import com.bambuco.salak.model.Category;

/**
 * Home object for domain model class Category.
 * 
 * @see com.bambuco.salak.model.Category
 * @author Hibernate Tools
 */
@Stateless
public class CategoryDAOImpl extends BaseDAOImpl<Category, Long> implements CategoryDAO{

	private static final Logger log = LoggerFactory.getLogger(CategoryDAOImpl.class);

	private EntityManager entityManager;

}
