package com.bambuco.salak.model;
// Generated 28/05/2016 09:59:11 PM by Hibernate Tools 5.1.0.Alpha1

import java.util.HashSet;
import java.util.Set;

/**
 * Product generated by hbm2java
 */
public class Product implements java.io.Serializable {

	private int idProduct;
	private Category category;
	private String name;
	private String description;
	private Integer price;
	private boolean state;
	private Set<ProductTag> productTags = new HashSet<ProductTag>(0);

	public Product() {
	}

	public Product(int idProduct, Category category, String name, String description, boolean state) {
		this.idProduct = idProduct;
		this.category = category;
		this.name = name;
		this.description = description;
		this.state = state;
	}

	public Product(int idProduct, Category category, String name, String description, Integer price, boolean state,
			Set<ProductTag> productTags) {
		this.idProduct = idProduct;
		this.category = category;
		this.name = name;
		this.description = description;
		this.price = price;
		this.state = state;
		this.productTags = productTags;
	}

	public int getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
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

	public Set<ProductTag> getProductTags() {
		return this.productTags;
	}

	public void setProductTags(Set<ProductTag> productTags) {
		this.productTags = productTags;
	}

}
