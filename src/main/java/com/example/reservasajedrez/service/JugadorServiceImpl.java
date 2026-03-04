package com.example.reservasajedrez.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservasajedrez.model.Jugador;
import com.example.reservasajedrez.repository.JugadorRepository;

@Service
public class JugadorServiceImpl implements JugadorService {

	private final JugadorRepository jugadorRepo;

	@Autowired
	public JugadorServiceImpl(JugadorRepository jugadorRepo) {
		super();
		this.jugadorRepo = jugadorRepo;
	}

	public String create(Jugador jugador) {
		if (jugador.getId() != null) {
			throw new IllegalStateException("No es pot crear l'usuari amb Id  no null");
		}
		jugadorRepo.save(jugador);
		return jugador.getId();
	}

	public Optional<Jugador> readById(String id) {
		return jugadorRepo.findById(id);
	}

	public Optional<Jugador> readByEmail(String email) {
		return jugadorRepo.findByEmail(email);
	}

	public void update(Jugador jugador) {
		if (jugador.getId() == null) {
			throw new IllegalStateException("No es pot actualizar un usuari amb id null");
		}
		if (!jugadorRepo.existsById(jugador.getId())) {
			throw new IllegalStateException("L'usuari amb " + jugador.getId() + " no existeix. No es pot actualitzar.");
		}
		jugadorRepo.save(jugador);
	}

	public void delete(String id) {
		if (id == null) {
			throw new IllegalStateException("No es pot eliminar un jugador amb id null");
		}
		if (jugadorRepo.findById(id).isPresent()) {
			jugadorRepo.deleteById(id);
		} else {
			throw new IllegalStateException("El jugador amb " + id + " no existeix. No es pot eliminar.");
		}
	}

	public List<Jugador> getAll() {
		return jugadorRepo.findAll();
	}
}
