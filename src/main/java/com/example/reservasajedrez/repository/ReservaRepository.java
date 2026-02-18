package com.example.reservasajedrez.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.reservasajedrez.model.Reserva;

@Repository
public interface ReservaRepository extends MongoRepository<Reserva, String>{
	
}
