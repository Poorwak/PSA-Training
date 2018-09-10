package com.psa.dao;

import java.util.List;

import com.psa.entity.CustomerEntity;

public interface CustomerDAO {
	
	public void addCustomer(CustomerEntity customer);
	//public boolean loginCustomer()
	
	public List<CustomerEntity> getAllCustomers();
}
