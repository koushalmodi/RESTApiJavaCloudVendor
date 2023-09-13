package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cloud_vendor_info")
public class CloudVendor {
	
	@Id
	private String id;
	private String name;
	private String phone;
	private String address;
	
	public CloudVendor(String id, String name, String phone, String address) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	public CloudVendor() {
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
