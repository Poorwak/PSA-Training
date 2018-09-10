package com.psa.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.psa.dao.CustomerDAO;
import com.psa.entity.CustomerEntity;

public class CustomerManagerImpl implements CustomerManager {
	
	private CustomerDAO customerDAO;

	@Override
	@Transactional
	public void addCustomer(CustomerEntity customer) {
		
		customerDAO.addCustomer(customer);
	}

	@Override
	@Transactional
	public List<CustomerEntity> getAllCustomers() {
		return customerDAO.getAllCustomers();
	}

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}



	
}
