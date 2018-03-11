package com.magasin.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.magasin.demo.domain.Cart;
import com.magasin.demo.domain.Item;
import com.magasin.demo.domain.Product;
import com.magasin.demo.service.CartService;
import com.magasin.demo.service.ItemService;
import com.magasin.demo.service.ProductService;

@RestController
@RequestMapping("/api")
public class CartController {

	@Autowired
	CartService cartService;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	ItemService itemService;
	
	
	@PostMapping("/cart")
	public Cart create() {
		Cart cart = new Cart();
		return cartService.saveCart(cart);
	}
	
	@GetMapping("/carts/{id}")
	public Optional<Cart> getCartById(@PathVariable(value = "id") Long cartId) {
		return cartService.getCartById(cartId);
	}

	@PostMapping("/cart/{cartId}/product/{productId}")
	public Item addItem(@PathVariable(value = "cartId") Long cartId, @PathVariable(value = "productId") Long productId) {
		Optional<Cart> cart = cartService.getCartById(cartId);
		Optional<Product> product = productService.getProductById(productId);
		Item item = new Item();
		item.setCart(cart.get());
		item.setProduct(product.get());
		return itemService.saveItem(item);
		
	}
	@DeleteMapping("/cart/{itemId}")
	public void removeItem(@PathVariable(value = "itemId") Long itemId) {
		Optional<Item> item =itemService.getItemById(itemId);
		itemService.deleteItem(item.get());
	}
	
	
	
	
	
}
