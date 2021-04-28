package cl.awakelab.mod5.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.awakelab.mod5.backend.entities.PagosEntity;
import cl.awakelab.mod5.backend.service.CrudService;


@RestController
@RequestMapping("/api/v1/pagos")
public class PagosController {
	
	@Autowired
	CrudService<PagosEntity> crudPagos;
	
	
	//MÉTODO PARA LISTAR API PAGOS
	@GetMapping
	public ResponseEntity<List<PagosEntity>> listadoPagos(){
		
		try {
			
			List<PagosEntity> listaPagos = new ArrayList<PagosEntity>();
			listaPagos = crudPagos.lista();
			
			if(listaPagos.isEmpty()) {
				
				return new ResponseEntity<List<PagosEntity>>(HttpStatus.NO_CONTENT);
				
			}else{
				return new ResponseEntity<List<PagosEntity>>(listaPagos, HttpStatus.OK);
			}
			
		} catch (Exception e) {
			return new ResponseEntity<List<PagosEntity>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//MÉTODO PARA CREAR NUEVO PAGO
		@PostMapping("/crear")
		public ResponseEntity<PagosEntity> crearPago(@RequestBody PagosEntity nuevoPagos) {
		
			 
			try {
				PagosEntity pagos = new PagosEntity();
				pagos = crudPagos.crear(nuevoPagos);	
				
				return new ResponseEntity<PagosEntity>(pagos, HttpStatus.OK);
				
			} catch (Exception e) {
				return new ResponseEntity<PagosEntity>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
}
