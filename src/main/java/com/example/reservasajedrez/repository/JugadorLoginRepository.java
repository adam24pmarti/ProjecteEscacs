package com.example.reservasajedrez.repository;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.reservasajedrez.model.JugadorLogin;

@Repository
public interface JugadorLoginRepository extends MongoRepository <JugadorLogin, String>{
	   Optional<JugadorLogin> findByUsername(String userName);
}