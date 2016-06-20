package com.bambucodev.salak.dao;

import java.util.List;

public interface BaseDao<T> {
	
	public void create(T entity);

	public void edit(T entity);

	public void remove(T entity);

	public T find(Object id);

	public List<T> findAll();

	public List<T> findRange(int[] range);

	public List<T> findPaginate(int firstResult, int maxResults);

	public int count();

}
