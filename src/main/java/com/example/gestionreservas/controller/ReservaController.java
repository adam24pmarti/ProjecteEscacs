package com.example.gestionreservas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import com.example.gestionreservas.model.Reserva;
import com.example.gestionreservas.service.ReservaService;

@RestController
@RequestMapping("api/reservas")
public class ReservaController {
	@Autowired
	private final ReservaService service;
	@Autowired
	public ReservaController(@Qualifier("ReservaServiceImpl") ReservaService service) {
		super();
		this.service = service;
	}
	
	@PostMapping
	public Reserva create(@RequestBody Reserva reserva) {
		return service.create(reserva);
	}
	
	@GetMapping("/{nif}")
	public EntityResponse<Reserva> findByID(String id) {
		return null;
	}
	
}
