package com.cinchapi.demo.commerce.rest;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.cinchapi.demo.commerce.dto.ProductDTO;
import com.cinchapi.demo.commerce.service.ProductService;

public class ProductResourceTest {

	private ProductResource productResource;

	@Before
	public void before() {

		ProductService productService = Mockito.mock(ProductService.class);

		productResource = new ProductResource(productService);
	}

	@Test
	public void addProduct() {
		
		ProductDTO product = new ProductDTO();
		product.setName("Toy");
		
		
		productResource.addProduct(product);

	}

}
