package com.cinchapi.demo.commerce.repository;

import com.cinchapi.concourse.Concourse;
import com.google.gson.Gson;

public abstract class SimpleConcourseRepository<T> implements ConcourseRepository<T> {

	private Concourse concourseClient;

	public SimpleConcourseRepository(Concourse conncourseClient) {
		this.concourseClient = conncourseClient;

	}

	@Override
	public T insert(T entity) {
		String one = new Gson().toJson(entity);

		concourseClient.insert(one);

		return entity;
	}

}
