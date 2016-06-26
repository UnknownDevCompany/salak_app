package com.bambucodev.salak.business.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bambucodev.salak.business.ProductBusiness;
import com.bambucodev.salak.dao.BaseDao;
import com.bambucodev.salak.dao.ProductDao;
import com.bambucodev.salak.model.Product;

/**
 * @author Angela Ramirez <www.bambucodev.com>
 *
 */
@Stateless
public class ProductBusinessImpl extends BaseBusinessImpl<Product> implements ProductBusiness {
	
	private static final Logger log = LogManager.getLogger();
	@EJB
	protected ProductDao productDao;

	@Override
	protected BaseDao<Product> getBaseDao() {
		return productDao;
	}
}
