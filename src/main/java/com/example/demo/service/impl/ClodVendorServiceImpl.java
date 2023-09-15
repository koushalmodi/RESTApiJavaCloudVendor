package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.exception.CloudVendorNotFoundException;
import com.example.demo.model.CloudVendor;
import com.example.demo.repository.CloudVendorRepository;
import com.example.demo.service.ClodVendorService;

@Service
public class ClodVendorServiceImpl implements ClodVendorService {
	
	CloudVendorRepository cloudVendorRepository;
	
	public ClodVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String create(CloudVendor clodVendor) {
		// TODO Auto-generated method stub
		cloudVendorRepository.save(clodVendor);
		return "Created";
	}

	@Override
	public String update(CloudVendor clodVendor) {
		// TODO Auto-generated method stub
		cloudVendorRepository.save(clodVendor);
		return "Updated";
	}

	@Override
	public CloudVendor get(String id) {
		// TODO Auto-generated method stub
		if(cloudVendorRepository.findById(id).isEmpty())
			throw new CloudVendorNotFoundException("Data not found");
		return cloudVendorRepository.findById(id).get();
	}

	@Override
	public String destroy(String id) {
		// TODO Auto-generated method stub
		cloudVendorRepository.deleteById(id);
		return "Deleted";
	}

	@Override
	public List<CloudVendor> getAll() {
		// TODO Auto-generated method stub
		return cloudVendorRepository.findAll();
	}
	
}
