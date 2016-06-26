package com.bambucodev.salak.business.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bambucodev.salak.business.RoleOptionBusiness;
import com.bambucodev.salak.dao.BaseDao;
import com.bambucodev.salak.dao.RoleOptionDao;
import com.bambucodev.salak.model.RoleOption;

/**
 * @author Angela Ramirez <www.bambucodev.com>
 *
 */
@Stateless
public class RoleOptionBusinessImpl extends BaseBusinessImpl<RoleOption> implements RoleOptionBusiness {

	private static final Logger log = LogManager.getLogger();
	@EJB
	protected RoleOptionDao roleOptionDao;

	@Override
	protected BaseDao<RoleOption> getBaseDao() {
		return roleOptionDao;
	}
}
