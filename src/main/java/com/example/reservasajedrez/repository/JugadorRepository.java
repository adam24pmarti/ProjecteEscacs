package com.example.reservasajedrez.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.reservasajedrez.model.Jugador;

public interface JugadorRepository extends MongoRepository <Jugador, String>{
	   Optional<Jugador> findByEmail(String email);
}
