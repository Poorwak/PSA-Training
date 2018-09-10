package com.psa.service;

import java.util.List;

import com.psa.entity.CustomerEntity;

public interface CustomerManager {
	
	public void addCustomer(CustomerEntity customer);
	
	public List<CustomerEntity> getAllCustomers();
}
