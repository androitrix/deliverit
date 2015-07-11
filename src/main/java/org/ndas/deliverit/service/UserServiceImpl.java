package org.ndas.deliverit.service;

import org.ndas.deliverit.persistence.User;
import org.ndas.deliverit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	
	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public User findByUsernameAndPassword(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
