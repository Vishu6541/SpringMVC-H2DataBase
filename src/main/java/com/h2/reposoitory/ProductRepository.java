package com.h2.reposoitory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.h2.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {


}
