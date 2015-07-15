package org.ndas.deliverit.service;

import java.util.List;

import org.ndas.deliverit.persistence.User;
import org.ndas.deliverit.repository.UserRepository;
import org.ndas.deliverit.web.security.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	
	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<User> findByUsernameAndPassword(String userName, String password) {
		return this.userRepository.findByUserNameAndPassword(userName, password);
	}

	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		User user = this.userRepository.findByUserName(username);
		if (user == null) {
			throw new UsernameNotFoundException(
					String.format("User with name {} not found", username));
		}
		
		return new CustomUserDetails(user);
	}

}
