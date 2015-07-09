package org.ndas.deliverit.repository;

import org.ndas.deliverit.data.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
