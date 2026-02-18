package com.example.reservasajedrez.exception;

public class PlayerException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public PlayerException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public PlayerException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
