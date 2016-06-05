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
 * Tag generated by hbm2java
 */
@Entity
@Table(name = "tag", schema = "public")
public class Tag implements java.io.Serializable {

	private int idTag;
	private String name;
	private boolean state;
	private Set<ProductTag> productTags = new HashSet<ProductTag>(0);

	public Tag() {
	}

	public Tag(int idTag, String name, boolean state) {
		this.idTag = idTag;
		this.name = name;
		this.state = state;
	}

	public Tag(int idTag, String name, boolean state, Set<ProductTag> productTags) {
		this.idTag = idTag;
		this.name = name;
		this.state = state;
		this.productTags = productTags;
	}

	@Id

	@Column(name = "id_tag", unique = true, nullable = false)
	public int getIdTag() {
		return this.idTag;
	}

	public void setIdTag(int idTag) {
		this.idTag = idTag;
	}

	@Column(name = "name", nullable = false, length = 50)
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tag")
	public Set<ProductTag> getProductTags() {
		return this.productTags;
	}

	public void setProductTags(Set<ProductTag> productTags) {
		this.productTags = productTags;
	}

}