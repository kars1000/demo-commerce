package com.cinchapi.demo.commerce.repository;

/**
 * 
 * @author karimassaf
 *
 * 
 */
public interface ConcourseRepository<T> {

	/**
	 * 
	 * @param entity
	 * @return
	 */
	public T insert(T entity);

}
