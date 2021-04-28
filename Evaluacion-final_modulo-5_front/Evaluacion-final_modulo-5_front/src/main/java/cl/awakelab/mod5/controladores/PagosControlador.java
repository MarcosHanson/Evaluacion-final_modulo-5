package cl.awakelab.mod5.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.awakelab.mod5.dto.Capacitacion;
import cl.awakelab.mod5.dto.Pago;
import cl.awakelab.mod5.servicio.InterfasServicios;

@Controller
@RequestMapping("api/v1/pagos")
public class PagosControlador {
	
	@Autowired
	InterfasServicios<Pago> ipagos;
	
	@GetMapping("/listadoPago")
	public String ejecutarListaPago(ModelMap modelLista) {
		modelLista.put("claveListaPagos", ipagos.listar());
		return "listadoPago" ;
		
	}
	@GetMapping("/crearPago")
	public String ejecutarPago() {
		return "crearPago" ;
	}
	
	@PostMapping("/crearPago")
	public String crearPago(@ModelAttribute("formCrearPago")Pago nuevoPago) { 
		
		ipagos.crear(nuevoPago);
		return "crearPago" ;
	}

}
