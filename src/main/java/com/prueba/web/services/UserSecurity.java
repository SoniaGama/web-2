package com.prueba.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.prueba.web.models.User;
import com.prueba.web.repositories.UserRepository;

@Component
public class UserSecurity implements UserDetailsService {
	
	private final UserRepository repository;
	
	@Autowired
	public UserSecurity(UserRepository repository) {
		this.repository = repository;
	}

	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		User user = this.repository.findByName(name);
		return new User(user.getName(), user.getPassword(),
				AuthorityUtils.createAuthorityList(user.getRoles()));
	}
	
}

/*
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
*/
