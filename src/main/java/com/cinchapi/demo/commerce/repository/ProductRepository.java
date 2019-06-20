package com.cinchapi.demo.commerce.repository;

import com.cinchapi.demo.commerce.entity.Product;

public interface ProductRepository extends ConcourseRepository<Product> {
	
	
	
	
	/**
	 * 
	 * @param name
	 * @return
	 * 
	 * Nelson some magic here would make life easy working with concord. Imagine doing queries without having to implement anything
	 * 
	 * https://www.baeldung.com/queries-in-spring-data-mongodb
	 */
	//public List<Product> findByProductName(String name);
	
	

}
