package com.bambucodev.salak.business.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bambucodev.salak.business.RoleBusiness;
import com.bambucodev.salak.dao.BaseDao;
import com.bambucodev.salak.dao.RoleDao;
import com.bambucodev.salak.model.Role;

/**
 * @author Angela Ramirez <www.bambucodev.com>
 *
 */
@Stateless
public class RoleBusinessImpl extends BaseBusinessImpl<Role> implements RoleBusiness {

	private static final Logger log = LogManager.getLogger();
	@EJB
	protected RoleDao roleDao;

	@Override
	protected BaseDao<Role> getBaseDao() {
		return roleDao;
	}
}
