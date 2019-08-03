/**
 * 
 */
package com.inventory.mgmt.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "supplier")
public class Supplier implements Serializable {

	private static final long serialVersionUID = -8103284410884593015L;

	@Id
	private String supplierId;

	private String name;
	private String email;
	private String phone;
	private String cellPhone;
	
	@JsonManagedReference("supplier-address")	  
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "supplier")
   	private List<SupplierAddress> supplierAddressList;

	@JsonManagedReference("supplier-item")
	@OneToMany(mappedBy = "supplier")
	private List<ItemSupplier> itemSupplierList;

	public Supplier() {
	}

	public Supplier(String supplierId, String name, String email, String phone, String cellPhone,
			List<SupplierAddress> supplierAddressList, List<ItemSupplier> itemSupplierList) {
		super();
		this.supplierId = supplierId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.cellPhone = cellPhone;
		this.supplierAddressList = supplierAddressList;
		this.itemSupplierList = itemSupplierList;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public List<SupplierAddress> getSupplierAddressList() {
		return supplierAddressList;
	}

	public void setSupplierAddressList(List<SupplierAddress> supplierAddressList) {
		this.supplierAddressList = supplierAddressList;
	}

	public List<ItemSupplier> getItemSupplierList() {
		return itemSupplierList;
	}

	public void setItemSupplierList(List<ItemSupplier> itemSupplierList) {
		this.itemSupplierList = itemSupplierList;
	}

}
