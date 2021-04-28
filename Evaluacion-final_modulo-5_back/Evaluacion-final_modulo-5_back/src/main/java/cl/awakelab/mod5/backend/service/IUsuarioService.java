package cl.awakelab.mod5.backend.service;

import cl.awakelab.mod5.backend.entities.UsuariosEntity;

public interface IUsuarioService {
	
	public UsuariosEntity buscarPorid(String idUsuario);
}
