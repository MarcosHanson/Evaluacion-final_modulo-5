package cl.awakelab.mod5.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.awakelab.mod5.backend.entities.ChequeoEntity;
import cl.awakelab.mod5.backend.entities.VisitasEntity;
import cl.awakelab.mod5.backend.service.CrudService;

@RestController
@RequestMapping("/api/v1/chequeo")
public class ChequeoController{

	@Autowired
	CrudService<ChequeoEntity> crudchequeo;
	
	//MÉTODO PARA LISTAR API VISITAS
	@GetMapping
	public ResponseEntity<List<ChequeoEntity>> listaVisitas(){
		
		try {
			List<ChequeoEntity> chequeos = new ArrayList<ChequeoEntity>();
			chequeos = crudchequeo.lista();
			
			if (chequeos.isEmpty()) {
				
				return new ResponseEntity<List<ChequeoEntity>>(HttpStatus.NO_CONTENT);
				
			}else{
				return new ResponseEntity<List<ChequeoEntity>>(chequeos, HttpStatus.OK);
			}
		} catch (Exception e) {
			return new ResponseEntity<List<ChequeoEntity>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
		
	}
}
