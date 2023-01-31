package cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.dto;

import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.domain.Jugada;
import jakarta.persistence.Column;

public class JugadaDto {
	
	private int idJugada;
	private int resultDau1;
	private int resultDau2;
	
		

	public JugadaDto(int idJugada, int resultDau1, int resultDau2) {
		this.idJugada = idJugada;
		this.resultDau1 = resultDau1;
		this.resultDau2 = resultDau2;
	}

	public JugadaDto() {
	}
	
	public JugadaDto(Jugada jugada) {
		this.idJugada=jugada.getIdJugada();
		this.resultDau1 = jugada.getResultDau1();
		this.resultDau2 = jugada.getResultDau2();
	}

	public int getIdJugada() {
		return idJugada;
	}

	public void setIdJugada(int idJugada) {
		this.idJugada = idJugada;
	}

	public int getResultDau1() {
		return resultDau1;
	}

	public void setResultDau1(int resultDau1) {
		this.resultDau1 = resultDau1;
	}

	public int getResultDau2() {
		return resultDau2;
	}

	public void setResultDau2(int resultDau2) {
		this.resultDau2 = resultDau2;
	}

	


}
