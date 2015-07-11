package org.ndas.deliverit.service;

import org.ndas.deliverit.persistence.User;

public interface UserService {

	public User findByUsernameAndPassword(String userName, String password);
	
}
