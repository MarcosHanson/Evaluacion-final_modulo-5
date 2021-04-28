package cl.awakelab.mod5.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import cl.awakelab.mod5.dto.Cliente;

public class ClienteImp implements InterfasServicios<Cliente> {

	@Autowired
	RestTemplate retTemp;

	@Override
	public List<Cliente> listar() {
		return null;
	}

	@Override
	public Cliente crear(Cliente dato) {
		return null;
	}

	@Override
	public void borrar(Cliente dato) {
		
	}

	@Override
	public Cliente modificar(Cliente dato) {
		return null;
	}

	@Override
	public Cliente buscarPorId(String runUsuario) {
		return null;
	}

}
