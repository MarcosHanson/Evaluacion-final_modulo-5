package cl.awakelab.mod5.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.awakelab.mod5.backend.entities.CapacitacionEntity;
import cl.awakelab.mod5.backend.service.CrudService;
import cl.awakelab.mod5.backend.service.ICapacitacionService;


@RestController
@RequestMapping("/api/v1/capacitacion")
public class CapacitacionController {
	
	@Autowired
	CrudService<CapacitacionEntity> crudCap;
	
	@Autowired
	ICapacitacionService iCapService;
	
	//MÉTODO PARA LISTAR API
	@GetMapping
	public ResponseEntity<List<CapacitacionEntity>> listadoCap(){
		
		try {
			
			List<CapacitacionEntity> listaCap = new ArrayList<CapacitacionEntity>();
			listaCap = crudCap.lista();
			
			if(listaCap.isEmpty()) {
				
				return new ResponseEntity<List<CapacitacionEntity>>(HttpStatus.NO_CONTENT);
				
			}else{
				return new ResponseEntity<List<CapacitacionEntity>>(listaCap, HttpStatus.OK);
			}
			
		} catch (Exception e) {
			return new ResponseEntity<List<CapacitacionEntity>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	//MÉTODO PARA CREAR NUEVA CAPACITACIÓN
	@PostMapping("/crear")
	public ResponseEntity<CapacitacionEntity> crearCapacitacion(@RequestBody CapacitacionEntity nuevaCap) {
	
		 
		try {
			CapacitacionEntity cap = new CapacitacionEntity();
			cap = crudCap.crear(nuevaCap);	
			
			return new ResponseEntity<CapacitacionEntity>(cap, HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<CapacitacionEntity>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//METODO PARA BUSCAR POR IDCAPACITACION
	
	@GetMapping("/buscar/{idCapacitacion}")
	public ResponseEntity<CapacitacionEntity> buscarPorId(@PathVariable Integer idCapacitacion){
		
		try {
			CapacitacionEntity cap= new CapacitacionEntity();
			cap = iCapService.buscarPorid(idCapacitacion);
			
			return new ResponseEntity<CapacitacionEntity>(cap, HttpStatus.OK);
		
		} catch (Exception e) {
			return new ResponseEntity<CapacitacionEntity>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
