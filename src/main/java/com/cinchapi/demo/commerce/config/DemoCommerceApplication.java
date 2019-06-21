package com.cinchapi.demo.commerce.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.cinchapi.concourse.Concourse;

@SpringBootApplication
@ComponentScan(basePackages = { "com.cinchapi.demo.commerce" })
public class DemoCommerceApplication {

	@Value("${concourse.host}")
	private String concourseServerHost;

	@Value("${concourse.port}")
	private int concourseServerPort;

	public static void main(String[] args) {
		SpringApplication.run(DemoCommerceApplication.class, args);
	}

	@Bean
	public Concourse getConcourseClient() {

		Concourse client = Concourse.connect(concourseServerHost, concourseServerPort, "admin", "admin");

		// Concourse client = new Concourse();
		return client;
	}

}
