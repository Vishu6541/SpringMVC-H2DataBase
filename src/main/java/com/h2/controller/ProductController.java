package com.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.h2.entity.Product;
import com.h2.entity.service.ProductService;

@RestController
public class ProductController {
	
	
	@Autowired
	ProductService productService;
	
	@GetMapping(value = "/products", produces = "application/json")
	public List<Product> getAllProduct() {
		return productService.getAllProduct();
	}

	

}
