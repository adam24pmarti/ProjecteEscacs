package com.example.reservasajedrez.dto;

public class RegisterRequest {
	private String username;
	private String password;
	
	private String nom;
	private String edat;
	private String sexe;
	private String nivell;
	private String email;
	
	public RegisterRequest() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
