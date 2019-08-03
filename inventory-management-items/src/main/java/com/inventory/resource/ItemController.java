package com.inventory.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.entity.InventoryItem;
import com.inventory.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController 
{
	@Autowired
	private ItemService itemService;
	
	@PostMapping("/save")
	public void createItem(InventoryItem inventoryItem)
	{
		itemService.createItem(inventoryItem);
	}
	
	@GetMapping("/getall")
	public List<InventoryItem> getAllItems()
	{
		List<InventoryItem> items = itemService.getAllItems();
		for (InventoryItem inventoryItem : items) {
			System.out.println(inventoryItem.getBrand().getBrandId());
			System.out.println(inventoryItem.getInventoryItemId());
		}
		return items;
	}
}