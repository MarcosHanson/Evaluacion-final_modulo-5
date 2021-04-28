package cl.awakelab.mod5.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.mod5.backend.entities.CapacitacionEntity;
import cl.awakelab.mod5.backend.repository.CapacitacionRespository;

@Service
public class CapacitacionServiceImp implements CrudService<CapacitacionEntity>, ICapacitacionService{

	@Autowired
	CapacitacionRespository repositorioCap;
	

	
	@Override
	public List<CapacitacionEntity> lista() {
		
		return repositorioCap.findAll();
	}

	@Override
	public CapacitacionEntity crear(CapacitacionEntity cap) {
	
		return repositorioCap.save(cap);
	}


	@Override
	public CapacitacionEntity editar(CapacitacionEntity dato) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CapacitacionEntity buscarPorid(Integer idCapacitacion) {
	
		return repositorioCap.findById(idCapacitacion).get();
	}

}
