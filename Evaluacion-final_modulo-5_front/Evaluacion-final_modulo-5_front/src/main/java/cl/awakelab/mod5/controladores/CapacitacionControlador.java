package cl.awakelab.mod5.controladores;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.awakelab.mod5.controladores.CapacitacionControlador;
import cl.awakelab.mod5.dto.Capacitacion;
import cl.awakelab.mod5.servicio.InterfasServicios;


@Controller
@RequestMapping("/capacitacion")
public class CapacitacionControlador {
	
	@Autowired
	InterfasServicios<Capacitacion> capService;
	
	private static final Logger consola = LoggerFactory.getLogger(CapacitacionControlador.class);


	@GetMapping("/crearCapacitacion")
	public String ejecutacrearcap() {
		return "crearCapacitacion" ;
	}
	
	@PostMapping ("/crearCapacitacion")
	public String crearCapacitacion(@ModelAttribute("FormCrearCapacitacion") Capacitacion nuevaCapacitacion) { 
		
		capService.crear(nuevaCapacitacion);
	
		consola.info("-------SE HA CREADO UNA NUEVA CAPACITACION----");
		
		return "crearCapacitacion";
	}
	
	
	@GetMapping("/listarCapacitacion")
	public String ejecutalistarcap(ModelMap mostrar) {
		
		List<Capacitacion> listarCapacitacion = capService.listar();
		
		mostrar.put("listaCapacitacion" , listarCapacitacion);
		
		consola.info("-------ESTO MUESTRA QUE LISTARCAPACITACION SIRVE----");
		
		return "listarCapacitacion"; 
	}
	
}
