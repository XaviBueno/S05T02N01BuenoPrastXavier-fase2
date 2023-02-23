package cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.services;


import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.dto.JugadorDto;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.domain.Jugador;
import  cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.repository.JugadorRepository;



@Service
public class JugadorServicesClass implements JugadorServices{
	
	@Autowired
	
	private JugadorRepository jugadorRepository;
	
	

	@Override
	
	public Jugador saveJugador(JugadorDto jugadorDto) {
		
		String nom;
		JugadorDto jugador= jugadorDto;
		nom=jugadorDto.getNom();
		nom.replace("\\s","");
		if(nom.isEmpty()) {
			jugador.setNom("ANONIM");
		}
		return jugadorRepository.save(new Jugador(jugador));
	}

	

	@Override
	public JugadorDto getOneJugador(int ident) {
		
		Jugador jugador=new Jugador();
		jugador=jugadorRepository.findById(ident).orElse(null);
		if(jugador==null) {
			return null;
		}
		else
			return new JugadorDto(jugador);
	}


	@Override
	public ArrayList<JugadorDto> getAllJugadors() {
		
		ArrayList<Jugador> jugadors= new ArrayList<Jugador>(jugadorRepository.findAll());
		ArrayList<JugadorDto> jugadorsDto=new ArrayList<JugadorDto>();
		Iterator<Jugador> iterator= jugadors.iterator();
		while(iterator.hasNext()) {
			jugadorsDto.add(new JugadorDto(iterator.next()));
			
		}
		return jugadorsDto;
		
	}


	

	@Override
	public boolean buscarJugador(String nom) {
		boolean resp=false;
		Jugador jugador= new Jugador();
		jugador=jugadorRepository.findByNom(nom);
		if(jugador!=null) {
			resp=true;
		}
		
		return resp;
		
	}


	public void esborraJugadesJugador(JugadorDto jugador) {
	
		int id= jugador.getIdJugador();;
		
		if(jugadorRepository.existsById(id)) {
			jugador.getJugades().clear();
			jugador.setExits(0.0);
			saveJugador(jugador);
			
		}
		
		
	}



	@Override
	public double exitsTotals() {
		jugadorRepository.findAll();
		JugadorDto jugador=new JugadorDto();
		
		return jugador.calculaExits(jugador);
	}
	
	
	

  
}

	

	

	

	
	


