package org.ndas.deliverit.service;

import java.util.List;

import org.ndas.deliverit.persistence.Customer;
import org.ndas.deliverit.persistence.Job;

public interface CustomerService {


	public List<Customer> getAllCustomers();
	
	public Job createCustomer(Customer j);
	
	public Job getCustomer(Long id);
}
