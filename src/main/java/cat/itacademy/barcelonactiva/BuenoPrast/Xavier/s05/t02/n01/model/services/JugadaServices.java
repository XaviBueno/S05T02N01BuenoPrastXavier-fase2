package cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.services;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.domain.Jugada;
import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.dto.JugadaDto;
import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.repository.JugadaRepository;

public class JugadaServices implements DausServices<Jugada,JugadaDto,String>{

	@Autowired
	private JugadaRepository jugadaRepository;
	
	@Override
	public Jugada saveItem(JugadaDto jugadaDto) {
		
		return jugadaRepository.save(new Jugada(jugadaDto));
	}

	@Override
	public boolean deleteItem(Jugada t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public JugadaDto getOneItem(int ident) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<JugadaDto> getAllItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean findItemByAttrib(String s) {
		// TODO Auto-generated method stub
		return false;
	}

}
