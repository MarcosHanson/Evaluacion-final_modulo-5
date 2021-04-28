package cl.awakelab.mod5.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.mod5.backend.entities.VisitasEntity;
import cl.awakelab.mod5.backend.repository.VisitasRepository;


@Service
public class VisitasServiceImp implements CrudService<VisitasEntity>{

	@Autowired
	VisitasRepository visitasRepository;

	@Override
	public List<VisitasEntity> lista() {
	
		return visitasRepository.findAll();
	}

	@Override
	public VisitasEntity crear(VisitasEntity dato) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VisitasEntity editar(VisitasEntity dato) {
		// TODO Auto-generated method stub
		return null;
	}

}
