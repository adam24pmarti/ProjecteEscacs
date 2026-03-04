package com.example.reservasajedrez.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.reservasajedrez.exception.PartidaException;
import com.example.reservasajedrez.exception.PlayerException;
import com.example.reservasajedrez.model.Jugador;
import com.example.reservasajedrez.service.JugadorService;
import com.example.reservasajedrez.service.ReservaService;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/jugadors")
@Tag(name = "Players", description = "API for managing chess players")
public class JugadorController {

	private final JugadorService jugadorService;

	public JugadorController(JugadorService jugadorService) {
		this.jugadorService = jugadorService;
	}

	public ResponseEntity<Jugador> create(@Valid @RequestBody Jugador jugador) {
		try {
			jugadorService.create(jugador);
		} catch (IllegalStateException e) {
			throw new PlayerException(e.getMessage(), HttpStatus.NOT_ACCEPTABLE);
		}
		return new ResponseEntity<>(jugador, HttpStatus.CREATED);

	}

	public List<Jugador> getAll() {
		return jugadorService.getAll();
	}

	@GetMapping("/cerca/{id}")
	public  ResponseEntity<Jugador>  cercaPerId(@PathVariable String id) {
		Optional<Jugador> optional=jugadorService.readById(id);
		
		if(!optional.isPresent()) {
			throw new PlayerException("Jugador no encontrado con id: + id" , HttpStatus.NOT_FOUND);
		}		
		return new ResponseEntity<>(optional.get(), HttpStatus.FOUND);
	}
	
	@GetMapping("/cerca/email")
	public  ResponseEntity<Jugador>  cercaPerEmail(String email) {
		Optional<Jugador> optional= jugadorService.readByEmail(email);
		
		if(!optional.isPresent()) {
			throw new PartidaException("Usuari no existent amb aquest email: " + email);
		}		
		return new ResponseEntity<>(optional.get(), HttpStatus.FOUND);
	}
	
	@DeleteMapping("/delete")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(String id) {		
		try {
			jugadorService.delete(id);
		} catch (IllegalStateException e) {
			throw new PlayerException(e.getMessage(), HttpStatus.NOT_ACCEPTABLE);
		}
	}
}
