package cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.domain;






import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.dto.JugadorDto;



@Document(value="jugadors")
public class Jugador {
	
	@Id
	private int idJugador;
	private String nom;
	private double exits;
	private ArrayList<Jugada> jugades;
	
	public Jugador(int idJugador, String nom) {
		this.idJugador = idJugador;
		this.nom = nom;
	}


	public Jugador() {
	}

	public Jugador(JugadorDto jugador) {
		
		this.idJugador=jugador.getIdJugador();
		this.nom=jugador.getNom();
		this.exits=jugador.getExits();
		this.jugades=jugador.getJugades();
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


	public double getExits() {
		return exits;
	}


	public void setExits(double exits) {
		this.exits = exits;
	}


	public ArrayList<Jugada> getJugades() {
		return jugades;
	}


	public void setJugades(ArrayList<Jugada> jugades) {
		this.jugades = jugades;
	}
	
	
	
	
}
