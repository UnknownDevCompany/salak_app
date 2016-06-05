package com.bambuco.salak.dao.impl;
// Generated 29/05/2016 09:49:37 PM by Hibernate Tools 5.1.0.Alpha1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bambuco.salak.dao.TagDAO;
import com.bambuco.salak.model.Tag;

/**
 * Home object for domain model class Tag.
 * 
 * @see com.bambuco.salak.model.Tag
 * @author Hibernate Tools
 */
@Stateless
public class TagDAOImpl extends BaseDAOImpl<Tag, Long> implements TagDAO{

	private static final Logger log = LoggerFactory.getLogger(TagDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

}
