package org.ndas.deliverit.service;

import java.util.List;

import org.ndas.deliverit.persistence.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	public List<User> findByUsernameAndPassword(String userName, String password);
	
}
