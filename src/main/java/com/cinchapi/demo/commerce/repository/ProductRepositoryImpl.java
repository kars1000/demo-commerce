package com.cinchapi.demo.commerce.repository;

import org.springframework.stereotype.Repository;

import com.cinchapi.concourse.Concourse;
import com.cinchapi.demo.commerce.entity.Product;

@Repository
public class ProductRepositoryImpl extends SimpleConcourseRepository<Product> implements ProductRepository {

	public ProductRepositoryImpl(Concourse concourseClient) {
		super(concourseClient);

	}

}
