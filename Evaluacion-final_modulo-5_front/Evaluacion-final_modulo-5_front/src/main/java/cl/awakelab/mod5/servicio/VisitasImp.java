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
import cl.awakelab.mod5.dto.Visitas;

@Service
public class VisitasImp implements InterfasServicios<Visitas> {

	private static final String APILISTARVISITAS = "http://localhost:8889/api/v1/visitas"; //REVISAR LOCALHOST DONDE ESTE CORRIENDO EL BACK

	@Autowired
	RestTemplate restTemplate;
	
	
	@Override
	public List<Visitas> listar() {
			
		HttpHeaders headers = new HttpHeaders();
		
		HttpEntity<Visitas> entityVisitas = new HttpEntity<Visitas>(headers);
		
		ResponseEntity<List<Visitas>> responseUsuarios = restTemplate.exchange(APILISTARVISITAS, HttpMethod.GET, entityVisitas, new ParameterizedTypeReference<List<Visitas>>() {
		});
		
		return responseUsuarios.getBody();
	}

	@Override
	public Visitas crear(Visitas dato) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrar(Visitas dato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Visitas modificar(Visitas dato) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visitas buscarPorId(String runUsuario) {
		// TODO Auto-generated method stub
		return null;
	}
}
