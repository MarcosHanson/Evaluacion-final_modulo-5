package cl.awakelab.mod5.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.mod5.backend.entities.ChequeoEntity;
import cl.awakelab.mod5.backend.repository.ChequeoRepository;


@Service
public class ChequeoServiceImp implements CrudService<ChequeoEntity>{

	@Autowired
	ChequeoRepository repositoryCheq;
	
	@Override
	public List<ChequeoEntity> lista() {
		
		return repositoryCheq.findAll();
	}

	@Override
	public ChequeoEntity crear(ChequeoEntity dato) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChequeoEntity editar(ChequeoEntity dato) {
		// TODO Auto-generated method stub
		return null;
	}

}
