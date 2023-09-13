package com.example.demo.service;

import java.util.List;

import com.example.demo.model.CloudVendor;

public interface ClodVendorService {
	public String create(CloudVendor clodVendor);
	public String update(CloudVendor clodVendor);
	public CloudVendor get(String id);
	public String destroy(String id);
	public List<CloudVendor> getAll();
}