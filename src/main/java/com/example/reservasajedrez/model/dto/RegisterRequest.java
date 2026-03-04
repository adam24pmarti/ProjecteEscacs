package com.example.reservasajedrez.model.dto;

import com.example.reservasajedrez.model.Role;

public class RegisterRequest {
	private String username;
	private String password;

	private String nom;
	private int edat;
	private String sexe;
	private String nivell;
	private String email;
	private Role role;

	public RegisterRequest() {
	}

	// Getters y setters
	
	
	public String getNom() {
		return nom;
	}
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getNivell() {
		return nivell;
	}

	public void setNivell(String nivell) {
		this.nivell = nivell;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	
}