package com.example.reservasajedrez.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("mesas")
public class Mesa {
	@Id
	private String id;
	private boolean disponibilidad;
	
	public Mesa(boolean disponibilidad) {
		super();
		this.disponibilidad = disponibilidad;
	}
	
	
}
