package com.example.gestionreservas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.gestionreservas.service.ReservaService;

public class ReservaController {
	@Autowired
	private final ReservaService service;
	@Autowired
	public ReservaController(@Qualifier("ReservaServiceImpl") ReservaService service) {
		super();
		this.service = service;
	}
	
}
