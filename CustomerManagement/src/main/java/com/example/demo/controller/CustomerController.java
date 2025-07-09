package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService cs;
	
	
	
	@PostMapping("addCustomer")
	String addCUSTomer(@RequestBody Customer c)
	{
		cs.addCustomer(c);
		
		return "customer added";

	}
	

}