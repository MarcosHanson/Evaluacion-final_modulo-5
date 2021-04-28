package cl.awakelab.mod5.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import cl.awakelab.mod5.dto.Capacitacion;

@Service
public class CapacitacionImp implements InterfasServicios<Capacitacion> {

	private static final String APILISTARCAPACITACION = "http://localhost:8889/api/v1/capacitacion";
	private static final String APICREARCAPACITACION = "http://localhost:8889/api/v1/capacitacion/crear";
	
	@Autowired
	RestTemplate restTemp;
	
	@Autowired
	InterfasServicios<Capacitacion> IntCapacitacion;

	
	@Override
	public List<Capacitacion> listar() {
			
		HttpHeaders headers = new HttpHeaders();
		
		HttpEntity<Capacitacion> entityCapacitacion = new HttpEntity<Capacitacion>(headers);
		
		ResponseEntity<List<Capacitacion>> responseUsuarios = restTemp.exchange(APILISTARCAPACITACION, HttpMethod.GET, entityCapacitacion, new ParameterizedTypeReference<List<Capacitacion>>() {
		});
		
		return responseUsuarios.getBody();
		
	}

	
	@Override
	public Capacitacion crear(Capacitacion dato) {
		
		ResponseEntity<Capacitacion> responseUsuario = restTemp.postForEntity(APICREARCAPACITACION, dato, Capacitacion.class);
		
		return responseUsuario.getBody();
	}

	@Override
	public void borrar(Capacitacion dato) {
		
	}

	@Override
	public Capacitacion modificar(Capacitacion dato) {
		return null;
	}

	@Override
	public Capacitacion buscarPorId(String runUsuario) {
		return null;
	}
	
}


	