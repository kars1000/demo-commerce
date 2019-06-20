package com.cinchapi.demo.commerce.service;

import com.cinchapi.demo.commerce.dto.ProductDTO;

public interface ProductService {

	/**
	 * 
	 * @param productToAdd
	 * @return
	 */
	public ProductDTO addProduct(ProductDTO productToAdd);

}
