package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository cr;
	
	public void addCustomer(Customer c)
	{
		
		cr.save(c);
	}

}
 