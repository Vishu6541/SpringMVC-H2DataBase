package com.h2.entity.service;

import java.util.List;
import java.util.Map;

import com.h2.entity.Product;

public interface ProductService {
	
	public void save(Product product);
	public Product fetchProductById(Integer id);
	public List<Product> getAllProduct();
	public void deleteProductById(Integer id);
	public void deleteAll();
	public void updateProduct(Product product);
	public void updateProductByPatch(Map<String, Object> map , Integer id);
	

}
