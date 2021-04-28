package cl.awakelab.mod5.controladores;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import cl.awakelab.mod5.dto.Usuarios;
import cl.awakelab.mod5.servicio.InterfasServicios;

@Controller
@RequestMapping("/administrativo")
public class UsuariosControlador {
	
	@Autowired
	InterfasServicios<Usuarios> usuarioService;
	
		@GetMapping("/crearUsuario")
		public String ejecutarUsuario() {
			return "crearUsuario" ;
		}
		
		@PostMapping("/crearUsuario")
		public String crearUsuario() { 
			return "crearUsuario" ;
		}
			
		@GetMapping("/listadoUsuario")
		public String ejecutarListaUsuario(ModelMap modelLista) {
			modelLista.put("claveListaUsuario", usuarioService.listar());
			
			return "listadoUsuario" ;
		}
	
		@GetMapping("/cliente")
		public String ejecutarEditarCliente() {
			return "editarCliente" ;
		}
		
		@GetMapping("/profesional")
		public String ejecutarEditarProfesional() {
			return "editarProfesional" ;
		}

		@GetMapping("/administrativo")
		public String ejecutarEditarAdministrativo() {
			
			return "editarAdministrativo" ;
		}
	
		
		//FALTA ENVIAR A DISTINTOS FORMULARIOS SEGUN TIPO DE USUARIO
		@GetMapping("/buscar")
		public  String buscarUsuario(@RequestParam("rut")String rutUsuario, ModelMap modelbuscar) {
			
			modelbuscar.put("claveRutUsuario", usuarioService.buscarPorId(rutUsuario));
			
			
			return  null;
		}
}