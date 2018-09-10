package com.psa.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.psa.entity.CustomerEntity;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	private SessionFactory sessionFactory;
	
	@Override
	public void addCustomer(CustomerEntity customer) {
		
		this.sessionFactory.getCurrentSession().save(customer);
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CustomerEntity> getAllCustomers() {
		
		return this.sessionFactory.getCurrentSession().createQuery("from CustomerEntity").list();
	}

}
