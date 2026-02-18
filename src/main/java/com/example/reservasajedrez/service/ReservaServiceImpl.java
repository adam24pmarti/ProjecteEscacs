package com.example.reservasajedrez.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.reservasajedrez.model.Reserva;
import com.example.reservasajedrez.repository.ReservaRepository;

@Service("reservaServiceImpl")
public class ReservaServiceImpl implements ReservaService {
	
	private final ReservaRepository repository;

	public ReservaServiceImpl(ReservaRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Reserva create (Reserva reserva) {
		return repository.save(reserva);
	}

	@Override
	public Optional<Reserva> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public Optional<Reserva> findByPlayer(String id) {
		return Optional.empty();
	}

	@Override
	public Optional<Reserva> findByGame(String id) {
		return Optional.empty();
	}

	@Override
	public boolean delete(String id) {
		boolean borrado = false;
		if (repository.existsById(id)) {
			repository.deleteById(id);
			borrado = true;
		}
		return borrado;
	}

	@Override
	public List<Reserva> listAll() {
		return repository.findAll();
	}
	
}
