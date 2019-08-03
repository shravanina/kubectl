package com.inventory.mgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.mgmt.entity.Supplier;
import com.inventory.mgmt.service.SuppliersService;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

	@Autowired
	private SuppliersService suppliersService;

	@PostMapping("/create")
	public void createSupplier(@RequestBody Supplier supplier) {
		this.suppliersService.createSupplier(supplier);
	}

	@PutMapping("/update")
	public void updateSupplier(@RequestBody Supplier supplier) {
		this.suppliersService.updateSupplier(supplier);
	}

	@DeleteMapping("/delete")
	public void deleteSupplier(@PathVariable String supplierID) {
		this.suppliersService.deleteSupplier(supplierID);
	}

	@GetMapping("/get/{supplierId}")
	public Supplier getBySupplierID(@PathVariable String supplierId) {
		return this.suppliersService.findById(supplierId);
	}
}