package cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.services;

import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.dto.JugadorDto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.domain.Jugador;
import  cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.repository.JugadorRepository;
import  cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.dto.JugadorDto;

@Service
public class JugadorServices implements DausServices<Jugador, JugadorDto,String >{
	
	@Autowired
	
	private JugadorRepository jugadorRepository;

	@Override
	
	public Jugador saveItem(JugadorDto jugadorDto) {
		
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
	public boolean deleteItem(Jugador jugador) {
		
		
		
		return false;
	}

	@Override
	public JugadorDto getOneItem(int ident) {
		
		Jugador jugador=new Jugador();
		jugador=jugadorRepository.findById(ident).orElse(null);
		if(jugador==null) {
			return null;
		}
		else
			return new JugadorDto(jugador);
	}

	@Override
	public ArrayList<JugadorDto> getAllItems() {
		
		List<Jugador> jugadors= new ArrayList<Jugador>();
		ArrayList<JugadorDto> jugadorsDto=new ArrayList<JugadorDto>();
		jugadors= jugadorRepository.findAll();
		Iterator<Jugador> iterator= jugadors.iterator();
		while(iterator.hasNext()) {
			jugadorsDto.add(new JugadorDto(iterator.next()));
			
		}
		return jugadorsDto;
		
	}

	
	

	@Override
	public boolean findItemByAttrib(String nom) {
		String nomJug;
		ArrayList<JugadorDto> jugadors=  getAllItems();
		Iterator<JugadorDto> iterator = jugadors.iterator();
		boolean result=false;
		while((iterator.hasNext())&&(result==false) ){
			nomJug=iterator.next().getNom();
			if((nomJug.equalsIgnoreCase(nom))&&(nomJug!="ANONIM")) {
				result=true;
			}
			
		}
		return result;
		
	}

}

	

	

	

	
	


