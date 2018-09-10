package com.psa.controller;



import java.util.List;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.psa.entity.CustomerEntity;
import com.psa.service.CustomerManager;

public class EditCustomerAction extends ActionSupport implements Preparable	{
	
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(EditCustomerAction.class);
	
	private List<CustomerEntity> customers;
	private CustomerEntity customer;
	private CustomerManager customerManager;
	
	public String listCustomers() {
		logger.info("listCustomers method called");
		customers = customerManager.getAllCustomers();
		return SUCCESS;
	}
	
	public String addCustomer() {
		logger.info("addCustomer method called");
		customerManager.addCustomer(customer);
		return "success";
	}

	@Override
	public void prepare() throws Exception {
		customer=null;
	}

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	public CustomerManager getCustomerManager() {
		return customerManager;
	}

	public void setCustomerManager(CustomerManager customerManager) {
		this.customerManager = customerManager;
	}

	public List<CustomerEntity> getCustomers() {
		return customers;
	}

	public void setCustomers(List<CustomerEntity> customers) {
		this.customers = customers;
	}
	
	
}
