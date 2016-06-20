/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bambucodev.salak.dao.impl;

import javax.ejb.Stateless;

import com.bambucodev.salak.dao.CategoryDao;
import com.bambucodev.salak.model.Category;

/**
 *
 * @author Ing. Jefferson Pérez Cervera <www.bambucodev.com>
 */
@Stateless
public class CategoryDaoImpl extends BaseDaoImpl<Category> implements CategoryDao {
	public CategoryDaoImpl() {
		super(Category.class);
	}

}
