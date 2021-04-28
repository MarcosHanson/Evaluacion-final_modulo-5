package cl.awakelab.mod5.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import cl.awakelab.mod5.dto.Contacto;

public class ContactoImp implements  InterfasServicios<Contacto> {

	@Autowired
	RestTemplate retTemp;

	@Override
	public List<Contacto> listar() {
		return null;
	}

	@Override
	public Contacto crear(Contacto dato) {
		return null;
	}

	@Override
	public void borrar(Contacto dato) {
		
	}

	@Override
	public Contacto modificar(Contacto dato) {
		return null;
	}

	@Override
	public Contacto buscarPorId(String runUsuario) {
		return null;
	}
}
