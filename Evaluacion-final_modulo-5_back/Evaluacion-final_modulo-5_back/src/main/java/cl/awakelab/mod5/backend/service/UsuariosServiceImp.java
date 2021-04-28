package cl.awakelab.mod5.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.mod5.backend.entities.UsuariosEntity;
import cl.awakelab.mod5.backend.repository.UsuariosRepository;

@Service
public class UsuariosServiceImp implements CrudService<UsuariosEntity>, IUsuarioService{

	
	@Autowired
	UsuariosRepository usuarioRepository;
	
	@Override
	public List<UsuariosEntity> lista() {
		
		return usuarioRepository.findAll();
	}

	@Override
	public UsuariosEntity crear(UsuariosEntity usuario) {
		
		return usuarioRepository.save(usuario);
	}

	@Override
	public UsuariosEntity editar(UsuariosEntity usuario) {
		
		return usuarioRepository.save(usuario);
	}
	
	@Override
	public UsuariosEntity buscarPorid(String idUsuario) {
		
		return usuarioRepository.findById(idUsuario).get();
	}

	
}
