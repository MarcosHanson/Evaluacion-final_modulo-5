package cl.awakelab.mod5.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contacto")
public class ContactoControlador {
	
	@GetMapping("/formulariocontacto")
	public String ejecutacontacto() {
		return "contacto" ;
	}
}
