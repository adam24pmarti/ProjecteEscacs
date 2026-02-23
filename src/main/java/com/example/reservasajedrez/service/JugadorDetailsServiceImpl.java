package com.example.reservasajedrez.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.reservasajedrez.model.JugadorLogin;
import com.example.reservasajedrez.repository.JugadorLoginRepository;

@Service
public class JugadorDetailsServiceImpl implements UserDetailsService{
	
	   @Autowired
	   private JugadorLoginRepository repo;
	   @Override
	   public UserDetails loadUserByUsername(String username)
	           throws UsernameNotFoundException {
	       JugadorLogin user = repo.findByUsername(username)
	               .orElseThrow(() ->
	                       new UsernameNotFoundException("Usuari no trobat"));
	       return new org.springframework.security.core.userdetails.User(
	               user.getUsername(),
	               user.getPassword(),
	               new ArrayList<>()
	       );
	   }
}
