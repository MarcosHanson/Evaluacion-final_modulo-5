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

import cl.awakelab.mod5.dto.Pago;
import cl.awakelab.mod5.dto.Usuarios;

@Service
public class PagoImp implements InterfasServicios<Pago> {
	
	private static final String APILISTARPAGOS = "http://localhost:8080/api/v1/pagos";
	private static final String APICREARPAGOS= "http://localhost:8080/api/v1/pagos/crear";

	@Autowired
	RestTemplate restTemp;
	
	@Override
	public List<Pago> listar() {
	HttpHeaders header = new HttpHeaders();
		
		HttpEntity<Pago> entityPagos= new HttpEntity<Pago>(header);
		
		ResponseEntity<List<Pago>> response = restTemp.exchange(APILISTARPAGOS, HttpMethod.GET,entityPagos, new ParameterizedTypeReference<List<Pago>>() {
		});
		return response.getBody();
	}

	@Override 
	public void borrar (Pago dato) {
		
	}

	@Override
	public Pago crear(Pago dato) {
		return null;
	}

	@Override
	public Pago modificar(Pago dato) {
		return null;
	}

	@Override
	public Pago buscarPorId(String runUsuario) {
		return null;
	}
}
