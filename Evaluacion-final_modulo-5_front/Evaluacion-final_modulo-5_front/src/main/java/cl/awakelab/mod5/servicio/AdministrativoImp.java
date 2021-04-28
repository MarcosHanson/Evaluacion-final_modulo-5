package cl.awakelab.mod5.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import cl.awakelab.mod5.dto.Administrativo;

public class AdministrativoImp implements InterfasServicios<Administrativo> {

	@Autowired
	RestTemplate retTemp;

	@Override
	public List<Administrativo> listar() {
		return null;
	}

	@Override
	public Administrativo crear(Administrativo dato) {
		return null;
	}

	@Override
	public void borrar(Administrativo dato) {
		
	}

	@Override
	public Administrativo modificar(Administrativo dato) {
		return null;
	}

	@Override
	public Administrativo buscarPorId(String runUsuario) {
		return null;
	}
}
