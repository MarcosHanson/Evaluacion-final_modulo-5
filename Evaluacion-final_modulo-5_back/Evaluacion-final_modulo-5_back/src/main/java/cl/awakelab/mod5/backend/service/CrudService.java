package cl.awakelab.mod5.backend.service;



import java.util.List;


public interface CrudService <E>{
	
	public List<E> lista();
	
	public E crear(E dato);
	
	public E editar(E dato);
	
	
	

	

}
