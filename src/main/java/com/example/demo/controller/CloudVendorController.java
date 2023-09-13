package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CloudVendor;
import com.example.demo.service.ClodVendorService;

@RestController
@RequestMapping("/home")
public class CloudVendorController {
	
	ClodVendorService clodVendorService;
	
	public CloudVendorController(ClodVendorService clodVendorService) {
		this.clodVendorService = clodVendorService;
	}

	@PostMapping
	public String create(@RequestBody CloudVendor cloudVendor)
	{
		return clodVendorService.create(cloudVendor);
		
	}
	
	@PutMapping("{id}")
	public String update(@RequestBody CloudVendor cloudVendor)
	{
		return clodVendorService.update(cloudVendor);
	}
	
	@GetMapping("{id}")
	public CloudVendor get(@PathVariable("id") String id)
	{
		return clodVendorService.get(id);
		
	}
	
	@GetMapping
	public List<CloudVendor> getAll(String id)
	{
		return clodVendorService.getAll();
		
	}
	
	@DeleteMapping("{id}")
	public String destroy(@PathVariable("id") String id)
	{
		return clodVendorService.destroy(id);
		
	}
}
