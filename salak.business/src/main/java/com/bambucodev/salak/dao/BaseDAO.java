package com.bambuco.salak.dao;

import java.io.Serializable;

/**
 * Interfaz generica para el acceso a datos
 * @author PC
 *
 * @param <E>
 * @param <PK>
 */
public interface BaseDAO<E, K extends Serializable> {

	public void persist(E transientInstance);

	public void remove(E persistentInstance);

	public E merge(E detachedInstance);

	public E findById(K id);

}
