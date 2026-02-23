package com.example.reservasajedrez.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.exemple.usuaris_sol.model.UserLogin;
import com.exemple.usuaris_sol.repository.UserLoginRepository;

@Service
public class JugadorDetailsServiceImpl {
	
	   @Autowired
	   private UserLoginRepository repo;
	   @Override
	   public UserDetails loadUserByUsername(String username)
	           throws UsernameNotFoundException {
	       UserLogin user = repo.findByUsername(username)
	               .orElseThrow(() ->
	                       new UsernameNotFoundException("Usuari no trobat"));
	       return new org.springframework.security.core.userdetails.User(
	               user.getUsername(),
	               user.getPassword(),
	               new ArrayList<>()
	       );
	   }
}
