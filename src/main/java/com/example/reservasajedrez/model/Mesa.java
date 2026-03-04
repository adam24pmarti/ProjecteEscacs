package com.example.reservasajedrez.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("mesas")
public class Mesa {
	@Id
	private String id;
	private boolean disponible;
	
	public Mesa(boolean disponible) {
		super();
		this.disponible = disponible;
	}

	public String getId() {
		return id;
	}

	public boolean isDisponible() {
		return disponible;
	}
	
}
