package com.bambucodev.salak.business;

import java.util.List;

/**
 * @author jefferpc
 *
 */

public interface BaseBusiness<T> {

	public void create(T entity) throws Exception;

	public void edit(T entity) throws Exception;

	public void remove(T entity) throws Exception;

	public T find(Object id) throws Exception;

	public List<T> findAll() throws Exception;

	public List<T> findRange(int[] range) throws Exception;

	public List<T> findPaginate(int firstResult, int maxResults) throws Exception;

	public int count() throws Exception;

}
