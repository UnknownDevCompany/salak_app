package com.bambucodev.salak.illusion.dto;
// Generated 29/05/2016 09:49:36 PM by Hibernate Tools 5.1.0.Alpha1

/**
 * ProductTag generated by hbm2java
 */
public class ProductTagDTO implements java.io.Serializable {

	private int idProductTag;
	private ProductDTO product;
	private TagDTO tag;

	public ProductTagDTO() {
	}

	public ProductTagDTO(int idProductTag, ProductDTO product, TagDTO tag) {
		this.idProductTag = idProductTag;
		this.product = product;
		this.tag = tag;
	}

	public int getIdProductTag() {
		return this.idProductTag;
	}

	public void setIdProductTag(int idProductTag) {
		this.idProductTag = idProductTag;
	}

	public ProductDTO getProduct() {
		return this.product;
	}

	public void setProduct(ProductDTO product) {
		this.product = product;
	}

	public TagDTO getTag() {
		return this.tag;
	}

	public void setTag(TagDTO tag) {
		this.tag = tag;
	}

}
