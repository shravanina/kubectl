package com.inventory.mgmt.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
@Table(name = "supplier_address")
public class SupplierAddress implements Serializable {

	private static final long serialVersionUID = 4748704394949492353L;

	@Id
	private int supplierAddressId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;

	@JsonBackReference("supplier-address")
	@ManyToOne
	@JoinColumn(name = "supplier_id")
	private Supplier supplier;

	@OneToOne
	@JoinColumn(name = "address_type_code")
	private RefAddressType refAddressType;

	private Date addressFrom;
	private Date addressTo;

	public SupplierAddress() {
	}

	public SupplierAddress(int supplierAddressId, Address address, Supplier supplier, RefAddressType refAddressType,
			Date addressFrom, Date addressTo) {
		super();
		this.supplierAddressId = supplierAddressId;
		this.address = address;
		this.supplier = supplier;
		this.refAddressType = refAddressType;
		this.addressFrom = addressFrom;
		this.addressTo = addressTo;
	}

	public int getSupplierAddressId() {
		return supplierAddressId;
	}

	public void setSupplierAddressId(int supplierAddressId) {
		this.supplierAddressId = supplierAddressId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public RefAddressType getRefAddressType() {
		return refAddressType;
	}

	public void setRefAddressType(RefAddressType refAddressType) {
		this.refAddressType = refAddressType;
	}

	public Date getAddressFrom() {
		return addressFrom;
	}

	public void setAddressFrom(Date addressFrom) {
		this.addressFrom = addressFrom;
	}

	public Date getAddressTo() {
		return addressTo;
	}

	public void setAddressTo(Date addressTo) {
		this.addressTo = addressTo;
	}

}
