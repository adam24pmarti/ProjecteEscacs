package com.example.reservasajedrez.exceptions;

public class ReservaNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ReservaNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReservaNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ReservaNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ReservaNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
