package org.ndas.deliverit.model;

import org.ndas.deliverit.persistence.Company;
import org.ndas.deliverit.persistence.User;

public class AuthenticationToken {

	private Company company;
	
	private User user;

	
	/**
	 * @param company
	 * @param user
	 */
	public AuthenticationToken(Company company, User user) {
		this.company = company;
		this.user = user;
	}

	/**
	 * @return the company
	 */
	public Company getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(Company company) {
		this.company = company;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
