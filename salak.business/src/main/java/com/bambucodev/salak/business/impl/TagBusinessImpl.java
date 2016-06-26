package com.bambucodev.salak.business.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bambucodev.salak.business.TagBusiness;
import com.bambucodev.salak.dao.BaseDao;
import com.bambucodev.salak.dao.TagDao;
import com.bambucodev.salak.model.Tag;

/**
 * @author Angela Ramirez <www.bambucodev.com>
 *
 */
@Stateless
public class TagBusinessImpl extends BaseBusinessImpl<Tag> implements TagBusiness {

	private static final Logger log = LogManager.getLogger();
	@EJB
	protected TagDao tagDao;

	@Override
	protected BaseDao<Tag> getBaseDao() {
		return tagDao;
	}
}
