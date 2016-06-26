/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bambucodev.salak.illusion.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.bambucodev.salak.business.CategoryBusiness;
import com.bambucodev.salak.illusion.CategoryIllusion;
import com.bambucodev.salak.illusion.dto.CategoryDTO;
import com.bambucodev.salak.model.Category;

/**
 *
 * @author Ing. Jefferson Pérez Cervera <www.bambucodev.com>
 */
@Stateless
public class CategoryIllusionImpl implements CategoryIllusion {

	@EJB
	private CategoryBusiness categoryBusiness;

	private CategoryDTO categoryToDTO(Category category) {
		CategoryDTO categoryDto=new CategoryDTO();
		categoryDto.setIdCategory(category.getIdCategory());
		categoryDto.setName(category.getName());
		categoryDto.setState(category.getState());
		return categoryDto;
		
	}

	private List<CategoryDTO> categoryToDTO(List<Category> categoryList) {
		List<CategoryDTO> categoryDtoList=new ArrayList<>();
		if(categoryList==null)
			return categoryDtoList;
		for (Category category : categoryList) {
			categoryDtoList.add(categoryToDTO(category));
		}
		return categoryDtoList;
	}

	@Override
	public List<CategoryDTO> findAll() throws Exception {
		return categoryToDTO(categoryBusiness.findAll());
	}

}
