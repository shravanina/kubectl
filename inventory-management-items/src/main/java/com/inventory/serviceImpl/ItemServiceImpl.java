package com.inventory.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.entity.InventoryItem;
import com.inventory.repository.ItemRepository;
import com.inventory.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService
{
	@Autowired
	private ItemRepository itemRepository;

	@Override
	public void createItem(InventoryItem inventoryItem) {
		itemRepository.save(inventoryItem);
	}

	@Override
	public List<InventoryItem> getAllItems() {
		List<InventoryItem> items = itemRepository.findAll();
		return items;
	}

}
