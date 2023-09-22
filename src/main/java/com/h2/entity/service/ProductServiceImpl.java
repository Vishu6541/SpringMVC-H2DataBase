package com.h2.entity.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h2.entity.Product;
import com.h2.reposoitory.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	Logger log = LoggerFactory.getLogger(ProductService.class);
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public void save(Product product) {
		log.info("save product method");
		productRepository.save(product);

	}

	@Override
	public Product fetchProductById(Integer id) {
		return productRepository.findById(id).get();
	}

	@Override
	public List<Product> getAllProduct() {
		log.info("get all  product method");
		return (List<Product>) productRepository.findAll();
	}

	@Override
	public void deleteProductById(Integer id) {
		productRepository.deleteById(id);

	}

	@Override
	public void deleteAll() {
		productRepository.deleteAll();

	}

	@Override
	public void updateProduct(Product product) {
		productRepository.save(product);

	}

	@Override
	public void updateProductByPatch(Map<String, Object> map, Integer id) {
		// TODO Auto-generated method stub

	}

}
