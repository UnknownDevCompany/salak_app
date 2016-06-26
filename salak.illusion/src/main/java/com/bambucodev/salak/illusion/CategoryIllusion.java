package com.bambucodev.salak.illusion;

import java.util.List;

import com.bambucodev.salak.illusion.dto.CategoryDTO;

public interface CategoryIllusion {
	
	public List<CategoryDTO> findAll() throws Exception;
	
}
