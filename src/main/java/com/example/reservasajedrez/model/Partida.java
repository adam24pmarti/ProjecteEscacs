package com.example.reservasajedrez.model;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "partidas")
public class Partida {
	
	@Id
	private String id;
	private String player1Id;
	private String player2Id;
	private String winnerId;
	private int table;
	private boolean finalitzada;

	public Partida(String id, String player1Id, String player2Id, String winnerId, int table, boolean finalitzada) {
		this.id = id;
		this.player1Id = player1Id;
		this.player2Id = player2Id;
		this.winnerId = winnerId;
		this.table = table;
		this.finalitzada = finalitzada;
	}
	
	public Partida(String id, String player1Id, String player2Id, int table, boolean finalitzada) {
		this.id = id;
		this.player1Id = player1Id;
		this.player2Id = player2Id;
		this.table = table;
		this.finalitzada = finalitzada;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getPlayer1Id() {
		return player1Id;
	}



	public void setPlayer1Id(String player1Id) {
		this.player1Id = player1Id;
	}



	public String getPlayer2Id() {
		return player2Id;
	}



	public void setPlayer2Id(String player2Id) {
		this.player2Id = player2Id;
	}



	public String getWinnerId() {
		return winnerId;
	}



	public void setWinnerId(String winnerId) {
		this.winnerId = winnerId;
	}


	public int getTable() {
		return table;
	}



	public void setTable(int table) {
		this.table = table;
	}

	
	
	public boolean isFinalitzada() {
		return finalitzada;
	}

	public void setFinalitzada(boolean finalitzada) {
		this.finalitzada = finalitzada;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Partida other = (Partida) obj;
		return Objects.equals(id, other.id);
	}



	@Override
	public String toString() {
		return "Partida [id=" + id + ", player1Id=" + player1Id + ", player2Id=" + player2Id + ", winner=" + winnerId + ", table="
				+ table + "]";
	}
	
	
	
}
