package com.bambucodev.salak.illusion.dto;
// Generated 29/05/2016 09:49:36 PM by Hibernate Tools 5.1.0.Alpha1

import java.util.ArrayList;
import java.util.List;

/**
 * Tag generated by hbm2java
 */
public class TagDTO implements java.io.Serializable {

	private Long idTag;
	private String name;
	private boolean state;
	private List<ProductTagDTO> productTags = new ArrayList<ProductTagDTO>(0);

	public TagDTO() {
	}

	public TagDTO(Long idTag, String name, boolean state) {
		this.idTag = idTag;
		this.name = name;
		this.state = state;
	}

	public TagDTO(Long idTag, String name, boolean state, List<ProductTagDTO> productTags) {
		this.idTag = idTag;
		this.name = name;
		this.state = state;
		this.productTags = productTags;
	}

	public Long getIdTag() {
		return this.idTag;
	}

	public void setIdTag(Long idTag) {
		this.idTag = idTag;
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

	public List<ProductTagDTO> getProductTags() {
		return this.productTags;
	}

	public void setProductTags(List<ProductTagDTO> productTags) {
		this.productTags = productTags;
	}

}
