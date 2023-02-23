package cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.domain;



import java.util.ArrayList;
import java.util.List;

import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.dto.JugadorDto;


public class Jugada {
	
	
	
	private int resultDau1;
	private int resultDau2;
	private boolean resultat;
	

	

	public Jugada() {
	}
	
	public Jugada(int resultDau1,int resultDau2,boolean resultat) {
	
		this.resultDau1=resultDau1;
		this.resultDau2=resultDau2;
		this.resultat=resultat;
		
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

	public boolean getResultat() {
		return resultat;
	}

	public void setResultat(boolean resultat) {
		this.resultat = resultat;
	}
	
	public Jugada generaJugada() {
		int dau1=10;
		int dau2=10;
		
		
		 dau1=(int)(Math.random()*6)+1;
		 dau2=(int)(Math.random()*6)+1;
		 
			
		Jugada jugada =new  Jugada(dau1,dau2,false);
		if((dau1+dau2==7)){
			jugada.setResultat(true);
		}
		else {
			jugada.setResultat(false);
		}
		
		 		
		return jugada;
	}
	
	public double calculaExitsTotals(List<Jugador> jugadors) {
		ArrayList<Jugada> jugades =new ArrayList<Jugada>();
		double 	jugadesTotals=0;
		double jugadesExit=0;
		for(Jugador jugador: jugadors) {
			jugades=jugador.getJugades();
			jugadesTotals+=jugades.size();
			for(Jugada jugada:jugades) {
				if(jugada.getResultat()) {
					jugadesExit+=1;
					
				}
			}
			
			
		}
	
		return jugadesExit/jugadesTotals*100;
		
	}
}
	


