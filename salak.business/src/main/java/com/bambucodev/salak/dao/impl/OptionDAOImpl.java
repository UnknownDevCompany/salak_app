package com.bambucodev.salak.dao.impl;
// Generated 29/05/2016 09:49:37 PM by Hibernate Tools 5.1.0.Alpha1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bambucodev.salak.dao.OptionDAO;
import com.bambucodev.salak.model.Option;

/**
 * Home object for domain model class Option.
 * 
 * @see com.bambucodev.salak.model.Option
 * @author Hibernate Tools
 */
@Stateless
public class OptionDAOImpl extends BaseDAOImpl<Option, Long> {

	private static final Logger log = LoggerFactory.getLogger(OptionDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

}
