package com.example.reservasajedrez.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservasajedrez.model.Partida;
import com.example.reservasajedrez.repository.PartidaRepository;

@Service
public class PartidaServiceImpl implements PartidaService{
	
	@Autowired
	PartidaRepository partidaRepository;
	
	@Override
	public String createPartida(Partida partida) {
		partidaRepository.save(partida);
		return partida.getId();
	}

	@Override
	public void finalizarPartida(Partida partida) {
		partida.setFinalitzada(true);
		
	}

	@Override
	public List<Partida> getPartides() {
		return partidaRepository.findAll();
	}
	
	@Override
	public List<Partida> getPartidesPerJugador(String jugadorId) {
		return partidaRepository.findAllByJugador(jugadorId);
	}

	@Override
	public List<Partida> getPartidesGuanyadesJugador(String jugadorId) {
		return partidaRepository.findAllByWinnerId(jugadorId);
	}

	@Override
	public List<Partida> getPartidesPerdudesJugador(String jugadorId) {
		return partidaRepository.findAllByJugadorIdAndWinnerIdNot(jugadorId, jugadorId);
	}

}
