package com.example.reservasajedrez.model.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import com.example.reservasajedrez.model.Jugador;
import com.example.reservasajedrez.model.Mesa;
import com.example.reservasajedrez.model.Partida;

public class ReservaDTO implements Serializable{
	private Long id;
	private Mesa mesa;
	private LocalTime hora; // HH:MM
	private LocalDate fecha; // AAAA-MM-DD
	private Jugador jugador;
	private Partida partida;
	
	public Mesa getMesa() {
		return mesa;
	}
	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Jugador getJugador() {
		return jugador;
	}
	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	public Partida getPartida() {
		return partida;
	}
	public void setPartida(Partida partida) {
		this.partida = partida;
	}
	public Long getId() {
		return id;
	}
	
}
