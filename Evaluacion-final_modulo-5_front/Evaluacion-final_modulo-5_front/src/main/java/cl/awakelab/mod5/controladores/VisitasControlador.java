package cl.awakelab.mod5.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.awakelab.mod5.dto.Visitas;
import cl.awakelab.mod5.servicio.InterfasServicios;

@Controller
@RequestMapping("/api/v1/visitas")
public class VisitasControlador {
	
	@Autowired
	InterfasServicios<Visitas> ivisitas;
		
		@GetMapping
		public String ejecutarVisitas(ModelMap modellista) {
			modellista.put("claveListaVisitas", ivisitas.listar());
			
			return "listadoVisitas" ;
		}
	}

