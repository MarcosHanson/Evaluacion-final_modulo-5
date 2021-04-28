package cl.awakelab.mod5.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.awakelab.mod5.backend.entities.UsuariosEntity;
import cl.awakelab.mod5.backend.service.CrudService;
import cl.awakelab.mod5.backend.service.IUsuarioService;



@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioControlador {

	@Autowired
	CrudService<UsuariosEntity> crudUsuario;
	
	@Autowired
	IUsuarioService iUsaurioService;
	
	
	//MÉTODO PARA LISTAR API
	@GetMapping
	public ResponseEntity<List<UsuariosEntity>> listadoUsuarios(){
		
		try {
			List<UsuariosEntity> listaUsuario = new ArrayList<UsuariosEntity>();
			listaUsuario = crudUsuario.lista();
			
			if (listaUsuario.isEmpty()) {
				
			return new ResponseEntity<List<UsuariosEntity>>(HttpStatus.NO_CONTENT);
				
			}else {
				return new ResponseEntity<List<UsuariosEntity>>(listaUsuario, HttpStatus.OK);
			}
			
		} catch (Exception e) {
				return new ResponseEntity<List<UsuariosEntity>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

	//MÉTODO PARA CREAR NUEVO USUARIO
	@PostMapping("/crear")
	public ResponseEntity<UsuariosEntity> crearUsuario(@RequestBody UsuariosEntity nuevoUsuario) {
	
		 
		try {
			UsuariosEntity usuario = new UsuariosEntity();
			usuario = crudUsuario.crear(nuevoUsuario);	
			
			return new ResponseEntity<UsuariosEntity>(usuario, HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<UsuariosEntity>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	//MÉTODO PARA EDITAR NUEVO USUARIO
		@PostMapping("/editar")
		public ResponseEntity<UsuariosEntity> editarUsuario(@RequestBody UsuariosEntity editaUsuario) {
		 
			try {
				UsuariosEntity usuario = new UsuariosEntity();
				usuario = crudUsuario.editar(editaUsuario);	
				
				return new ResponseEntity<UsuariosEntity>(usuario, HttpStatus.OK);
				
			} catch (Exception e) {
				
				return new ResponseEntity<UsuariosEntity>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
		}
	
	
	

	//MÉTODO PARA BUSCAR POR ID
	@GetMapping("/buscar/{idUsuario}")
	public ResponseEntity<UsuariosEntity> buscarPorId(@PathVariable String idUsuario) {

		try {
			UsuariosEntity usuario = new UsuariosEntity();
			usuario = iUsaurioService.buscarPorid(idUsuario);	
			
			return new ResponseEntity<UsuariosEntity>(usuario, HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<UsuariosEntity>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	



}
