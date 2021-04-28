package cl.awakelab.mod5.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.awakelab.mod5.backend.entities.VisitasEntity;
import cl.awakelab.mod5.backend.service.CrudService;

@RestController
@RequestMapping("/api/v1/visitas")
public class VisitasController{

	@Autowired
	CrudService<VisitasEntity> crudVisitas;
	
	//MÉTODO PARA LISTAR API VISITAS
	@GetMapping
	public ResponseEntity<List<VisitasEntity>> listaVisitas(){
		
		try {
			List<VisitasEntity> visitas = new ArrayList<VisitasEntity>();
			visitas = crudVisitas.lista();
			
			if (visitas.isEmpty()) {
				
				return new ResponseEntity<List<VisitasEntity>>(HttpStatus.NO_CONTENT);
				
			}else{
				return new ResponseEntity<List<VisitasEntity>>(visitas, HttpStatus.OK);
			}
		} catch (Exception e) {
			return new ResponseEntity<List<VisitasEntity>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
		
	}
}
