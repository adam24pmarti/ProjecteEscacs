package com.example.reservasajedrez.exception;

import org.springframework.http.HttpStatus;

public class PlayerException extends RuntimeException {
	
	private HttpStatus httpStatus;
	
	public PlayerException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public PlayerException(String message, HttpStatus httpStatus) {
		super(message);
		this.httpStatus = httpStatus;
	}
}
