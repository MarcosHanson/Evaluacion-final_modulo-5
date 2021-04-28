package cl.awakelab.mod5.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.mod5.backend.entities.ClienteEntity;



public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer>{

	
	public ClienteEntity findByRutCliente(Integer rutCliente);
}
