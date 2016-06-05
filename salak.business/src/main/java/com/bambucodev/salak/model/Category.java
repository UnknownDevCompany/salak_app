package com.bambuco.salak.model;
// Generated 29/05/2016 09:49:36 PM by Hibernate Tools 5.1.0.Alpha1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Category generated by hbm2java
 */
@Entity
@Table(name = "category", schema = "public")
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

	@Id

	@Column(name = "id_category", unique = true, nullable = false)
	public Long getIdCategory() {
		return this.idCategory;
	}

	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}

	@Column(name = "name", nullable = false, length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "state", nullable = false)
	public boolean isState() {
		return this.state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	public Set<Product> getProducts() {
		return this.products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}