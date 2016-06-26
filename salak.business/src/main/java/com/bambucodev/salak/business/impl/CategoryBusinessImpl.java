package com.bambucodev.salak.business.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bambucodev.salak.business.CategoryBusiness;
import com.bambucodev.salak.dao.BaseDao;
import com.bambucodev.salak.dao.CategoryDao;
import com.bambucodev.salak.model.Category;

/**
 * @author Angela Ramirez <www.bambucodev.com>
 *
 */
@Stateless
public class CategoryBusinessImpl extends BaseBusinessImpl<Category> implements CategoryBusiness {

	private static final Logger log = LogManager.getLogger();
	@EJB
	protected CategoryDao categoryDao;

	@Override
	protected BaseDao<Category> getBaseDao() {
		return categoryDao;
	}

}
