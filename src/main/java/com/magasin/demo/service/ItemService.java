package com.magasin.demo.service;

import java.util.Optional;

import com.magasin.demo.domain.Item;

public interface ItemService {

	public Optional<Item> getItemById(Long id);
	public Item saveItem(Item item);
	public void deleteItem(Item item);
	
}
