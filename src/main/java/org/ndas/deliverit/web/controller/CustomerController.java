package org.ndas.deliverit.web.controller;

import java.util.List;

import org.ndas.deliverit.persistence.Customer;
import org.ndas.deliverit.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

	private CustomerService customerService;
	
	@Autowired
	public CustomerController(CustomerService service) {
		this.setCustomerService(service);
	}
	
	@RequestMapping(value="customers")
	public ModelAndView list() {
		List<Customer> customers = customerService.getAllCustomers();
		ModelAndView mdv = new ModelAndView();
		mdv.setViewName("customerList");
		mdv.addObject("customers", customers);
		
		return mdv;
	}

	/**
	 * @return the customerService
	 */
	public CustomerService getCustomerService() {
		return customerService;
	}

	/**
	 * @param customerService the customerService to set
	 */
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
}
