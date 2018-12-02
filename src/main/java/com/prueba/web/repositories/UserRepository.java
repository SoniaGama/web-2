package com.prueba.web.repositories;

import com.prueba.web.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String>{
	@Override
	void delete(User deleted);
	User findByName(String name);
}
