package com.example.gestionreservas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.gestionreservas.model.Reserva;

@Repository
public interface ReservaRepository extends MongoRepository<Reserva, String>{
	
}
