package com.bambucodev.salak.business.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bambucodev.salak.business.BaseBusiness;
import com.bambucodev.salak.dao.BaseDao;

/**
 * 
 * @author jefferpc
 *
 */

public abstract class BaseBusinessImpl<T> implements BaseBusiness<T>{

	private static final Logger log = LogManager.getLogger();

	@Override
	public void create(T entity) throws Exception {
		getBaseDao().create(entity);
		
	}

	@Override
	public void edit(T entity) throws Exception {
		getBaseDao().edit(entity);
		
	}

	@Override
	public void remove(T entity) throws Exception {
		getBaseDao().remove(entity);
		
	}

	@Override
	public T find(Object id) throws Exception {
		
		return getBaseDao().find(id);
	}

	@Override
	public List<T> findAll() throws Exception {
		
		return getBaseDao().findAll();
	}

	@Override
	public List<T> findRange(int[] range) throws Exception {
		
		return getBaseDao().findRange(range);
	}

	@Override
	public List<T> findPaginate(int firstResult, int maxResults) throws Exception {
		
		return  getBaseDao().findPaginate(firstResult, maxResults);
	}

	@Override
	public int count() throws Exception {
		
		return getBaseDao().count();
	}
	
	protected abstract BaseDao<T>  getBaseDao();
	

}
