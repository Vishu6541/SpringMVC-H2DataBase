package com.h2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.h2.entity.Product;
import com.h2.entity.service.ProductService;
import com.h2.reposoitory.ProductRepository;

@SpringBootApplication
public class H2DbExampleApplication implements CommandLineRunner {
	
	@Autowired
	ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(H2DbExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		productService.save(new Product(0,"Samsung",1000));
		productService.save(new Product(0,"LG",1000));
		productService.save(new Product(0,"Apple",1000));
		productService.save(new Product(0,"Sony",1000));
		
	}

}
