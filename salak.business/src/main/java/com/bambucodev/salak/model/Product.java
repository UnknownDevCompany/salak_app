package com.bambucodev.salak.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


/**
 * The persistent class for the product database table.
 * 
 */
@Entity
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PRODUCT_IDPRODUCT_GENERATOR", sequenceName="SE_PRODUCT")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PRODUCT_IDPRODUCT_GENERATOR")
	@Column(name="id_product")
	private Long idProduct;

	private String description;

	private String name;

	private Integer price;

	private Boolean state;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="id_category")
	private Category category;

	//bi-directional many-to-one association to ProductTag
	@OneToMany(mappedBy="product")
	private List<ProductTag> productTags;

	public Product() {
	}

	public Long getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Boolean getState() {
		return this.state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<ProductTag> getProductTags() {
		return this.productTags;
	}

	public void setProductTags(List<ProductTag> productTags) {
		this.productTags = productTags;
	}

	public ProductTag addProductTag(ProductTag productTag) {
		getProductTags().add(productTag);
		productTag.setProduct(this);

		return productTag;
	}

	public ProductTag removeProductTag(ProductTag productTag) {
		getProductTags().remove(productTag);
		productTag.setProduct(null);

		return productTag;
	}

}