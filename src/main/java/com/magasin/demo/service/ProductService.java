package com.magasin.demo.service;

import java.util.List;
import java.util.Optional;

import com.magasin.demo.domain.Product;

public interface ProductService {
	List<Product> findAll();
	Optional<Product> getProductById(Long id);
}
