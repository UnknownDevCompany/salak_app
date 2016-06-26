package com.bambucodev.salak.illusion.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author jefferpc
 *
 */
public class CategoryDTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -304740775691855302L;
	private Long idCategory;
	private String name;
	private boolean state;
	private List<ProductDTO> products = new ArrayList<ProductDTO>(0);

	public CategoryDTO() {
	}

	public CategoryDTO(Long idCategory, String name, boolean state) {
		this.idCategory = idCategory;
		this.name = name;
		this.state = state;
	}

	public CategoryDTO(Long idCategory, String name, boolean state,List<ProductDTO> products) {
		this.idCategory = idCategory;
		this.name = name;
		this.state = state;
		this.products = products;
	}

	public Long getIdCategory() {
		return this.idCategory;
	}

	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isState() {
		return this.state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public List<ProductDTO> getProducts() {
		return this.products;
	}

	public void setProducts(List<ProductDTO> products) {
		this.products = products;
	}

}
