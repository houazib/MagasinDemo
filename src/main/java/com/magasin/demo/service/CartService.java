package com.magasin.demo.service;

import java.util.Optional;

import com.magasin.demo.domain.Cart;

public interface CartService {

	public Optional<Cart> getCartById(Long id);
	public Cart saveCart(Cart cart);
}
