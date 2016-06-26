package com.bambucodev.salak.illusion.dto;
// Generated 29/05/2016 09:49:36 PM by Hibernate Tools 5.1.0.Alpha1

import java.util.ArrayList;
import java.util.List;

/**
 * Product generated by hbm2java
 */
public class ProductDTO implements java.io.Serializable {

	private Long idProduct;
	private CategoryDTO category;
	private String name;
	private String description;
	private Integer price;
	private boolean state;
	private List<ProductTagDTO> productTags = new ArrayList<ProductTagDTO>(0);

	public ProductDTO() {
	}

	public ProductDTO(Long idProduct, CategoryDTO category, String name, String description, boolean state) {
		this.idProduct = idProduct;
		this.category = category;
		this.name = name;
		this.description = description;
		this.state = state;
	}

	public ProductDTO(Long idProduct, CategoryDTO category, String name, String description, Integer price, boolean state,
			List<ProductTagDTO> productTags) {
		this.idProduct = idProduct;
		this.category = category;
		this.name = name;
		this.description = description;
		this.price = price;
		this.state = state;
		this.productTags = productTags;
	}

	public Long getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public CategoryDTO getCategory() {
		return this.category;
	}

	public void setCategory(CategoryDTO category) {
		this.category = category;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public boolean isState() {
		return this.state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public List<ProductTagDTO> getProductTags() {
		return this.productTags;
	}

	public void setProductTags(List<ProductTagDTO> productTags) {
		this.productTags = productTags;
	}

}
