package cl.awakelab.mod5.servicio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.httpclient.Header;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import cl.awakelab.mod5.dto.Usuarios;


@Service
public class UsuarioImp implements InterfasServicios<Usuarios>{

	private static final String APILISTARUSUARIO = "http://localhost:8889/api/v1/usuarios";
	private static final String APICREARUSUARIO = "http://localhost:8889/api/v1/usuarios/crear";
	private static final String APIBUSCARPORRUN = "http://localhost:8889/api/v1/usuarios/buscar/{idUsuario}";
	
	@Autowired
	RestTemplate restTemp;
	
	//@Autowired
	//BCryptPasswordEn bCPE;
	
	@Override
	public List<Usuarios> listar() {
		
		HttpHeaders header = new HttpHeaders();
		
		HttpEntity<Usuarios> entityUsuario= new HttpEntity<Usuarios>(header);
		
		ResponseEntity<List<Usuarios>> response = restTemp.exchange(APILISTARUSUARIO, HttpMethod.GET,entityUsuario, new ParameterizedTypeReference<List<Usuarios>>() {
		});
		return response.getBody();
	}

	@Override
	public Usuarios crear(Usuarios dato) {
		
		//String clave = bCPE.encode(dato.getPassword());
		
		//dato.setPassword(clave);
		
		ResponseEntity<Usuarios> responseUsuario = restTemp.postForEntity(APICREARUSUARIO, dato, Usuarios.class);
		
		return responseUsuario.getBody();
	}

	@Override
	public void borrar(Usuarios dato) {
		
	}

	@Override
	public Usuarios modificar(Usuarios dato) {
		return null;
	}

	
	@Override
	public Usuarios buscarPorId(String runUsuario) {
	
		Map<String, String> maparun = new HashMap<String, String>();
		maparun.put("idUsuario", runUsuario);
		
		ResponseEntity<Usuarios> responseUsuario = restTemp.getForEntity(APIBUSCARPORRUN, Usuarios.class, maparun);
		
		return responseUsuario.getBody();
	} 

}
