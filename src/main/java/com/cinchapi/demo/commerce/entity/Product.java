package com.cinchapi.demo.commerce.entity;


import java.util.Random;

import com.cinchapi.demo.commerce.dto.ProductDTO;

public class Product {

	private long id = new Random().nextLong();
	private String name;
	private String description;

	public Product(ProductDTO product) {
		this.name = product.getName();
		this.description = product.getDescription();
		
		;

	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

}
