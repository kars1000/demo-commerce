package com.cinchapi.demo.commerce.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cinchapi.demo.commerce.dto.ProductDTO;
import com.cinchapi.demo.commerce.service.ProductService;

@RestController
@RequestMapping("/v1/products")
public class ProductResource {
	
	private ProductService productService;

	public ProductResource(ProductService productService) {

		this.productService = productService;

	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public ProductDTO addProduct(@RequestBody ProductDTO product) {
		return productService.addProduct(product);
	}

}
