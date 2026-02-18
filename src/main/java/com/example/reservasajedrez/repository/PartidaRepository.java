package com.example.reservasajedrez.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.reservasajedrez.model.Partida;

public interface PartidaRepository extends MongoRepository<Partida, String>{
	
	List<Partida> findAllByJugador(String jugadorId);
	
	List<Partida> findAllByWinnerId(String winnerId);

    List<Partida> findAllByJugadorIdAndWinnerIdNot(String jugadorId, String winnerId);
}
