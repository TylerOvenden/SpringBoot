package com.tove.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tove.demo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
	CloudVendor cv;
	/*
	 * 
	 * 
	 * 
	 * example data for the cv in the json format {
    "id" : "234",
    "name": "John Smith",
    "address": "343 St",
    "phone" : "123456789"
		}
	 * 
	 * */
	
	@GetMapping("{id}")
	public CloudVendor getCloudVendorDetails(String vendorId) {

		//return new CloudVendor("2341","John Smith", "1990 Main St", "234234231");
		return cv;
	
	}
	
	@PostMapping
	public String createCloudVendorDetail(@RequestBody CloudVendor cv) {
		this.cv = cv;
		return "successful creation of cloud vendor";
		
		
	}
	/*
	 * to be able to view the output json file will need to put 
	 * http://localhost:8080/cloudvendor/2341 into browser, 
	 * 2341 being the mapped variable
	 * */
	
	
	
	@PutMapping
	public String updateCloudVendorDetail(@RequestBody CloudVendor cv) {
		this.cv = cv;
		return "successful update of cloud vendor";
		
		
	}

	
	@DeleteMapping("{id}")
	public String deleteCloudVendorDetail(@RequestBody CloudVendor cv) {
	//can remove the cloud vendor by setting it to null
		this.cv = null;
		return "cloud vendor deleted";
	}
	
}
