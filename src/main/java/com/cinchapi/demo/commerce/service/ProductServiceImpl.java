package com.cinchapi.demo.commerce.service;

import org.springframework.stereotype.Service;

import com.cinchapi.demo.commerce.dto.ProductDTO;
import com.cinchapi.demo.commerce.entity.Product;
import com.cinchapi.demo.commerce.repository.ProductRepository;

/**
 * 
 * @author karimassaf
 * 
 *         This is where the actual transaction should be open. From here we may
 *         call multiple services that will be in the same transaction. Either
 *         they will all fail or everything will role back
 *
 */
@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;

	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;

	}

	@Override
	public ProductDTO addProduct(ProductDTO productDTO) {

		Product product = productRepository.insert(new Product(productDTO));

		return new ProductDTO(product);
	}

}
