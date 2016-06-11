package com.bambucodev.salak.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


/**
 * The persistent class for the tag database table.
 * 
 */
@Entity
@NamedQuery(name="Tag.findAll", query="SELECT t FROM Tag t")
public class Tag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TAG_IDTAG_GENERATOR", sequenceName="SE_TAG")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TAG_IDTAG_GENERATOR")
	@Column(name="id_tag")
	private Integer idTag;

	private String name;

	private Boolean state;

	//bi-directional many-to-one association to ProductTag
	@OneToMany(mappedBy="tag")
	private List<ProductTag> productTags;

	public Tag() {
	}

	public Integer getIdTag() {
		return this.idTag;
	}

	public void setIdTag(Integer idTag) {
		this.idTag = idTag;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getState() {
		return this.state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	public List<ProductTag> getProductTags() {
		return this.productTags;
	}

	public void setProductTags(List<ProductTag> productTags) {
		this.productTags = productTags;
	}

	public ProductTag addProductTag(ProductTag productTag) {
		getProductTags().add(productTag);
		productTag.setTag(this);

		return productTag;
	}

	public ProductTag removeProductTag(ProductTag productTag) {
		getProductTags().remove(productTag);
		productTag.setTag(null);

		return productTag;
	}

}