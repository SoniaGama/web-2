package com.prueba.web.services;

import com.prueba.web.models.User;
import com.prueba.web.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserSecurity implements UserDetailsService {
	//encontrar y autenticar usuarios
	@Autowired
	private UserRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		 
		User user = repository.findByName(name);

	    if(user == null) {
	      throw new UsernameNotFoundException("User not found");
	    }

	    return (UserDetails) new User();
	   
	}

}
