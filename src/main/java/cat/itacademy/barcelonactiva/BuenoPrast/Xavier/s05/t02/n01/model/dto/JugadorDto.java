package cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.domain.Jugador;


public class JugadorDto {
	
	
	private int idJugador;
	private String nom;


	public JugadorDto(int idJugador, String nom) {
		this.idJugador = idJugador;
		this.nom = nom;
	}


	public JugadorDto() {
	}
	
	public JugadorDto(Jugador jugador) {
		
		this.idJugador=jugador.getIdJugador();
		this.nom=jugador.getNom();
		
		
	}


	public int getIdJugador() {
		return idJugador;
	}


	public void setIdJugador(int idJugador) {
		this.idJugador = idJugador;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
}
