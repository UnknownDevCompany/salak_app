package com.bambucodev.salak.business.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bambucodev.salak.business.ModuleBusiness;
import com.bambucodev.salak.dao.BaseDao;
import com.bambucodev.salak.dao.ModuleDao;
import com.bambucodev.salak.model.Module;

/**
 * @author Angela Ramirez <www.bambucodev.com>
 *
 */
@Stateless
public class ModuleBusinessImpl extends BaseBusinessImpl<Module> implements ModuleBusiness {

	private static final Logger log = LogManager.getLogger();
	@EJB
	protected ModuleDao moduleDao;

	@Override
	protected BaseDao<Module> getBaseDao() {
		return moduleDao;
	}

}
