package com.bambuco.salak.illusion.dto;
// Generated 29/05/2016 09:49:36 PM by Hibernate Tools 5.1.0.Alpha1

import java.util.HashSet;
import java.util.Set;

/**
 * Category generated by hbm2java
 */
public class Category implements java.io.Serializable {

	private Long idCategory;
	private String name;
	private boolean state;
	private Set<Product> products = new HashSet<Product>(0);

	public Category() {
	}

	public Category(Long idCategory, String name, boolean state) {
		this.idCategory = idCategory;
		this.name = name;
		this.state = state;
	}

	public Category(Long idCategory, String name, boolean state, Set<Product> products) {
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

	public Set<Product> getProducts() {
		return this.products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}
