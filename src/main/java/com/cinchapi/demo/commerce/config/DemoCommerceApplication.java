package com.cinchapi.demo.commerce.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.cinchapi.concourse.Concourse;

@SpringBootApplication
@ComponentScan(basePackages = { "com.cinchapi.demo.commerce" })
public class DemoCommerceApplication {

	private static final String SERVER_HOST = "localhost";

	private static final int SERVER_PORT = 1717;

	public static void main(String[] args) {
		SpringApplication.run(DemoCommerceApplication.class, args);
	}

	@Bean
	public Concourse getConcourseClient() {

		Concourse client = Concourse.connect(SERVER_HOST, SERVER_PORT, "admin", "admin");

		// Concourse client = new Concourse();
		return client;
	}

}
