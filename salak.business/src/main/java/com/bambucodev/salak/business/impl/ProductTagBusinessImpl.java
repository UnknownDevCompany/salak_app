package com.bambucodev.salak.business.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bambucodev.salak.business.ProductTagBusiness;
import com.bambucodev.salak.dao.BaseDao;
import com.bambucodev.salak.dao.ProductTagDao;
import com.bambucodev.salak.model.ProductTag;

/**
 * @author Angela Ramirez <www.bambucodev.com>
 *
 */
@Stateless
public class ProductTagBusinessImpl extends BaseBusinessImpl<ProductTag> implements ProductTagBusiness {
	
	private static final Logger log = LogManager.getLogger();
	@EJB
	protected ProductTagDao productTagDao;

	@Override
	protected BaseDao<ProductTag> getBaseDao() {
		return productTagDao;
	}
}
