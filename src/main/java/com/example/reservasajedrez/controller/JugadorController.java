package com.example.reservasajedrez.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reservasajedrez.exception.PlayerException;
import com.example.reservasajedrez.model.Jugador;
import com.example.reservasajedrez.service.JugadorService;
import com.example.reservasajedrez.service.ReservaService;

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
    
    public ResponseEntity<Jugador> create(
    		@Valid @RequestBody Jugador jugador) {
    	try {
    		
    	}catch(IllegalStateException e){
    		throw new PlayerException(e.getMessage(), HttpStatus.NOT_ACCEPTABLE);
    	}
    	return new ResponseEntity<>(jugador, HttpStatus.CREATED);
    	
    }
    public List<Jugador> getAll(){
    	return jugadorService.getAll();
    	
    }
    
    
}
