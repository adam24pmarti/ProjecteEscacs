package com.example.reservasajedrez.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reservasajedrez.model.Partida;
import com.example.reservasajedrez.service.PartidaService;

@RestController
@RequestMapping("/partides")
public class PartidaController {
	
	private final PartidaService partidaService;
	
	@Autowired
	public PartidaController(PartidaService partidaService) {
		super();
		this.partidaService = partidaService;
	}
	
	public ResponseEntity<Partida> create(@RequestBody Partida partida){
		try {
			partidaService.createPartida(partida);
		} catch (Exception e) {

		}
		return new ResponseEntity<Partida>(partida, HttpStatus.CREATED);
	}
	
	@GetMapping("/cercatots")
	public List<Partida> getAll(){
		return partidaService.getPartides();
	}
	
	@GetMapping("/cercaperid")
	public List<Partida> getPartidesJugador(String jugadorId){
		return partidaService.getPartidesPerJugador(jugadorId);
	}
	
	@GetMapping("/cercaguanyades")
	public List<Partida> getPartidesGuanyadesJugador(String jugadorId){
		return partidaService.getPartidesGuanyadesJugador(jugadorId);
	}
	
	@GetMapping("/cercaperdudes")
	public List<Partida> getPartidesPerdudesJugador(String jugadorId){
		return partidaService.getPartidesPerdudesJugador(jugadorId);
	}
	
}
