package com.magasin.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.magasin.demo.domain.Product;
import com.magasin.demo.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return productService.findAll();
	}

	@GetMapping("/products/{id}")
	public Optional<Product> getProductById(@PathVariable(value = "id") Long productId) {
		return productService.getProductById(productId);
	}

}
