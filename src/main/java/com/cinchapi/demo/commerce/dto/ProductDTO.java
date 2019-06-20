package com.cinchapi.demo.commerce.dto;

import com.cinchapi.demo.commerce.entity.Product;

public class ProductDTO {

	private long id;
	private String name;
	private String description;

	public ProductDTO(Product product) {
		this.id = product.getId();
		this.name= product.getName();
		this.description = product.getDescription();
	}

	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
