package com.inventory.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "inventory_item")
public class InventoryItem {
	@Id
	private String inventoryItemId;
	
	@ManyToOne(fetch = FetchType.EAGER)//manytoone unidirectional
	@JoinColumn(name = "brand_id")
	private Brand brand;

	@OneToOne
	@JoinColumn(name = "item_category_code")
	private RefItemCategory refItemCategory;
	
	private String itemDescription;
	private int averageMonthlyUsage;
	private int reorderLevel;
	private int reorderQuantity;

	public InventoryItem() {}

	public InventoryItem(String inventoryItemId, Brand brand, RefItemCategory refItemCategory, String itemDescription,
			int averageMonthlyUsage, int reorderLevel, int reorderQuantity) {
		super();
		this.inventoryItemId = inventoryItemId;
		this.brand = brand;
		this.refItemCategory = refItemCategory;
		this.itemDescription = itemDescription;
		this.averageMonthlyUsage = averageMonthlyUsage;
		this.reorderLevel = reorderLevel;
		this.reorderQuantity = reorderQuantity;
	}

	@Override
	public String toString() {
		return "InventoryItem [inventoryItemId=" + inventoryItemId + ", brand=" + brand + ", refItemCategory="
				+ refItemCategory + ", itemDescription=" + itemDescription + ", averageMonthlyUsage="
				+ averageMonthlyUsage + ", reorderLevel=" + reorderLevel + ", reorderQuantity=" + reorderQuantity + "]";
	}

	public String getInventoryItemId() {
		return inventoryItemId;
	}

	public void setInventoryItemId(String inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public RefItemCategory getRefItemCategory() {
		return refItemCategory;
	}

	public void setRefItemCategory(RefItemCategory refItemCategory) {
		this.refItemCategory = refItemCategory;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public int getAverageMonthlyUsage() {
		return averageMonthlyUsage;
	}

	public void setAverageMonthlyUsage(int averageMonthlyUsage) {
		this.averageMonthlyUsage = averageMonthlyUsage;
	}

	public int getReorderLevel() {
		return reorderLevel;
	}

	public void setReorderLevel(int reorderLevel) {
		this.reorderLevel = reorderLevel;
	}

	public int getReorderQuantity() {
		return reorderQuantity;
	}

	public void setReorderQuantity(int reorderQuantity) {
		this.reorderQuantity = reorderQuantity;
	}

}