package cl.awakelab.mod5.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import cl.awakelab.mod5.dto.Profesional;

public class ProfesionalImp implements InterfasServicios<Profesional> {

	@Autowired
	RestTemplate retTemp;

	@Override
	public List<Profesional> listar() {
		return null;
	}

	@Override
	public Profesional crear(Profesional dato) {
		return null;
	}

	@Override
	public void borrar(Profesional dato) {
		
	}

	@Override
	public Profesional modificar(Profesional dato) {
		return null;
	}

	@Override
	public Profesional buscarPorId(String runUsuario) {
		return null;
	}
	
	
}
