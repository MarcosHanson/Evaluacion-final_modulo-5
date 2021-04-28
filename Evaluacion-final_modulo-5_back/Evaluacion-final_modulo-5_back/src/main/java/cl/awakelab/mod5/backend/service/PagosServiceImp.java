package cl.awakelab.mod5.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.mod5.backend.entities.PagosEntity;
import cl.awakelab.mod5.backend.repository.PagosRepository;

@Service
public class PagosServiceImp  implements CrudService<PagosEntity>{

	@Autowired
	PagosRepository pagosRepository;
	
	@Override
	public List<PagosEntity> lista() {
		
		return pagosRepository.findAll();
	}

	@Override
	public PagosEntity crear(PagosEntity pagos) {
		
		return pagosRepository.save(pagos);
	}

	@Override
	public PagosEntity editar(PagosEntity dato) {
		// TODO Auto-generated method stub
		return null;
	}

}
