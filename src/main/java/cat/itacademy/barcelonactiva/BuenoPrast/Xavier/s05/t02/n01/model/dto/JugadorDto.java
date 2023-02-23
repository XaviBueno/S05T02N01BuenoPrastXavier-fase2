package cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.dto;



import java.util.ArrayList;

import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.domain.Jugada;
import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.domain.Jugador;


public class JugadorDto {
	
	
	private int idJugador;
	private String nom;
	private double exits;
	private ArrayList<Jugada> jugades;


	public JugadorDto(int idJugador, String nom) {
		this.idJugador = idJugador;
		this.nom = nom;
	}


	public JugadorDto() {
	}
	
	public JugadorDto(Jugador jugador) {
		
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
	
	
	public double calculaExits(JugadorDto jugador) {
		ArrayList<Jugada> jugadesJugador;
		jugadesJugador= jugador.getJugades();
		 double numJugades=jugadesJugador.size();
		// jugadesJugador=jugadaRepository.findByJugadorAndResultat(new Jugador(jugador),true);
		 double numExits=0;
		 for(Jugada jugada:jugadesJugador) {
			if(jugada.getResultat()) {
				++numExits;
			}
			 
		 }
		 
		 numExits=numExits/numJugades*100;
		 return numExits;
	}
	
}
