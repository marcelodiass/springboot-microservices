package com.marcelodias.microservices.product_service;

import org.springframework.boot.SpringApplication;

public class TestProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(ProductServiceApplication::main).with(ProductServiceApplicationTests.class).run(args);
	}

}
