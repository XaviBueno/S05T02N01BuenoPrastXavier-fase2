package cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.dto.JugadorDto;
import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.services.JugadorServices;

@Controller
public class jugadorControlers {
	
	@Autowired
	private JugadorServices jugadorServices; 
	
	@GetMapping("/players")
	
	public String menuPlayers() {
		
		return "players.html";
		
	}
	
	@GetMapping("/players/input")
	
	public String inputJugador(Model model) {
		
		
		model.addAttribute("jugador", new JugadorDto());
		
		return "dadesJugador.html";
	}
	
	@PostMapping("/players/save")
	
	public String saveJugador(JugadorDto jugador) {
		
		jugadorServices.saveItem(jugador);
		
		return "redirect:/players";
		
	}
	
		
	@GetMapping("/players/inputidjugador")
	
	public String inputIdJugador(Model model) {
		int idJugador=0;
		
		model.addAttribute("idJugador",idJugador);
		return"inputIdJugador.html";
		
		
		
	}
	@PostMapping("/players/update")
	
	public String playersUpdate(int idJugador,Model model) {
		JugadorDto jugador=new JugadorDto();
		
		 jugador= jugadorServices.getOneItem(idJugador);
		if (jugador==null) {
			System.out.println("jugador inexistent");
			return "redirect:/players";
			
		}
		else {
			model.addAttribute("jugador", jugador);
			
			return "dadesJugador.html";
		}
		
		
	}
	@GetMapping("/players/check")
	
	public String comprobaNom(JugadorDto jugador) {
		
		if(!jugadorServices.findItemByAttrib(jugador.getNom())) {
			
			saveJugador( jugador);
		}
		else {
			
		}
		return "redirect:/players";
	}
	
	
	

}
