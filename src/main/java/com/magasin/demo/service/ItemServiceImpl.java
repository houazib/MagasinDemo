package com.magasin.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magasin.demo.domain.Item;
import com.magasin.demo.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemRepository itemRepository;
	
	
	
	@Override
	public Item saveItem(Item item) {
		return itemRepository.save(item);
	}

	@Override
	public Optional<Item> getItemById(Long id) {
		return itemRepository.findById(id);
	}

	@Override
	public void deleteItem(Item item) {
		itemRepository.delete(item);		
	}
	
	

}
