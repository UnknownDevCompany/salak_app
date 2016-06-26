package com.bambucodev.salak.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The persistent class for the product_tag database table.
 * 
 */
@Entity
@Table(name="product_tag")
@NamedQuery(name="ProductTag.findAll", query="SELECT p FROM ProductTag p")
public class ProductTag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PRODUCT_TAG_IDPRODUCTTAG_GENERATOR", sequenceName="SE_PRODUCT_TAG")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PRODUCT_TAG_IDPRODUCTTAG_GENERATOR")
	@Column(name="id_product_tag")
	private Long idProductTag;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="id_product")
	private Product product;

	//bi-directional many-to-one association to Tag
	@ManyToOne
	@JoinColumn(name="id_tag")
	private Tag tag;

	public ProductTag() {
	}

	public Long getIdProductTag() {
		return this.idProductTag;
	}

	public void setIdProductTag(Long idProductTag) {
		this.idProductTag = idProductTag;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Tag getTag() {
		return this.tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

}