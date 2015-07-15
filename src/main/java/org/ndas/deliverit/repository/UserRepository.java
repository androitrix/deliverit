package org.ndas.deliverit.repository;

import java.util.List;

import org.ndas.deliverit.persistence.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	/**
	 * Finds user with the provide userName and Password
	 * @param userName
	 * @param password
	 * @return list of users
	 */
	public List<User> findByUserNameAndPassword(String userName, String password);

	public User findByUserName(String username);
}
