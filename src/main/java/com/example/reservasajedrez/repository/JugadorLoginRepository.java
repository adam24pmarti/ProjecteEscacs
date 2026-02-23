package com.example.reservasajedrez.repository;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.reservasajedrez.model.JugadorLogin;

public interface JugadorLoginRepository extends MongoRepository <JugadorLogin, String>{
	   Optional<JugadorLogin> findByUsername(String userName);
}