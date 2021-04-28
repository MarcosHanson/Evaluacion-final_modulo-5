package cl.awakelab.mod5.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class InicioControlador {

	@GetMapping("/inicio")
	public String inicio(){
		return "/inicio";
	}
}
