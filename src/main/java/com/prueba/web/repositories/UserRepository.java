package com.prueba.web.repositories;

//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.prueba.web.models.User;

@RepositoryRestResource(exported = false)
public interface UserRepository extends Repository<User, Long>{
/*public interface UserRepository extends CrudRepository<User, String>{*/
	//@Override
	//void delete(User deleted);
	User findByName(String name);
	User save(User user); 
}
