package cl.awakelab.mod5.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioControlador {
	
	@GetMapping("/")
	public String ejecutainicio() {
		return "inicio" ;
	}
}
