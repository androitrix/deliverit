package org.ndas.deliverit.service;

import java.util.List;

import org.ndas.deliverit.persistence.User;

public interface UserService {

	public List<User> findByUsernameAndPassword(String userName, String password);
	
}
