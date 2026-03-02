package com.example.reservasajedrez.service;

import java.util.List;
import java.util.Optional;

import com.example.reservasajedrez.model.Jugador;


public interface JugadorService {
	String create(Jugador jugador);	   // C
	
	Optional<Jugador> readById(String id);   // R	
	
	Optional<Jugador> readByEmail(String email);
		
	void update(Jugador jugador);	// U	
	
	void delete(String id);	// D
	
	List<Jugador> getAll();
}
