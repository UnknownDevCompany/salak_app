package com.bambucodev.salak.business.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bambucodev.salak.business.OptionBusiness;
import com.bambucodev.salak.dao.BaseDao;
import com.bambucodev.salak.dao.OptionDao;
import com.bambucodev.salak.model.Option;

/**
 * @author Angela Ramirez <www.bambucodev.com>
 *
 */
@Stateless
public class OptionBusinessImpl extends BaseBusinessImpl<Option> implements OptionBusiness {
	
	private static final Logger log = LogManager.getLogger();
	@EJB
	protected OptionDao optionDao;

	@Override
	protected BaseDao<Option> getBaseDao() {
		return optionDao;
	}
}
